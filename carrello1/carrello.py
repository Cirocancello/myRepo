from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
from sqlalchemy import create_engine, Column, Integer, String, Float, ForeignKey
from sqlalchemy.orm import sessionmaker, relationship
from sqlalchemy.ext.declarative import declarative_base

app = FastAPI()

# Configura la connessione al database SQLite
DATABASE_URL = "sqlite:///./test.db"
engine = create_engine(DATABASE_URL)

SessionLocal = sessionmaker(autocommit=False, autoflush=False, bind=engine)

Base = declarative_base()

# Definisci i modelli per l'entità Utente, Prodotto e il carrello
class User(Base):
    __tablename__ = "users"

    id = Column(Integer, primary_key=True, index=True)
    email = Column(String, unique=True, index=True)
    nome = Column(String)
    cognome = Column(String)
    data_di_nascita = Column(String)
    anni = Column(Integer)
    password = Column(String)

    cart = relationship("CartItem", back_populates="owner")

class Product(Base):
    __tablename__ = "products"

    id = Column(Integer, primary_key=True, index=True)
    nome = Column(String)
    prezzo = Column(Float)
    descrizione = Column(String)

class CartItem(Base):
    __tablename__ = "cart_items"

    id = Column(Integer, primary_key=True, index=True)
    user_id = Column(Integer, ForeignKey("users.id"))
    product_id = Column(Integer, ForeignKey("products.id"))
    quantity = Column(Integer)

    owner = relationship("User", back_populates="cart")
    product = relationship("Product")

Base.metadata.create_all(bind=engine)

# Modello Pydantic per l'entità Utente
class UserBase(BaseModel):
    email: str
    nome: str
    cognome: str
    data_di_nascita: str
    anni: int

class UserCreate(UserBase):
    password: str

class UserInDB(UserBase):
    id: int

# Modello Pydantic per l'entità Prodotto
class ProductBase(BaseModel):
    nome: str
    prezzo: float
    descrizione: str

class ProductCreate(ProductBase):
    pass

class ProductInDB(ProductBase):
    id: int

# Modello Pydantic per il carrello
class CartItemBase(BaseModel):
    user_id: int
    product_id: int
    quantity: int

class CartItemCreate(CartItemBase):
    pass

class CartItemInDB(CartItemBase):
    id: int

# Endpoint per creare un utente
@app.post("/user/")
async def create_user(user: UserCreate):
    db_user = User(**user.dict())
    db = SessionLocal()
    db.add(db_user)
    db.commit()
    db.refresh(db_user)
    db.close()
    return db_user

# Endpoint per creare un prodotto
@app.post("/product/")
async def create_product(product: ProductCreate):
    db_product = Product(**product.dict())
    db = SessionLocal()
    db.add(db_product)
    db.commit()
    db.refresh(db_product)
    db.close()
    return db_product

# Endpoint per aggiungere un prodotto al carrello
@app.post("/cart/")
async def add_to_cart(item: CartItemCreate):
    db_item = CartItem(**item.dict())
    db = SessionLocal()
    db.add(db_item)
    db.commit()
    db.refresh(db_item)
    db.close()
    return db_item

# Endpoint per ottenere il carrello di un utente
@app.get("/cart/{user_id}")
async def get_cart(user_id: int):
    db = SessionLocal()
    cart_items = db.query(CartItem).filter(CartItem.user_id == user_id).all()
    db.close()
    return cart_items

if __name__ == "__main__":
    import uvicorn
    uvicorn.run(app, host="0.0.0.0", port=8000)
