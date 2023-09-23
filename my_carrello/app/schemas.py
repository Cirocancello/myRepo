from pydantic import BaseModel


class ItemBase(BaseModel):
    title: str
    description: str | None = None
    price: float


class ItemCreate(ItemBase):
    pass


class Item(ItemBase):
    id: int
    owner_id: int

    class Config:
        orm_mode = True


class UserBase(BaseModel):
    first_name: str 
    surname: str 
    date_of_birth: str 
    age: int
    email: str
    password: str

class UserCreate(UserBase):
    pass


class User(UserBase):
    id: int
    is_active: bool
    items: list[Item] = []

    class Config:
        orm_mode = True
