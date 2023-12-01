'use strict';

let book = {
    author : "Enrico",
    pages : 340,
    chapterPages : [90,50,60,140],
};
console.log(book);

let book2 = {...book}; //copia l'oggetto book in book2
console.log(book2);

book2.pages = 10;  // modifico l'oggetto book 2 
console.log(book);
console.log(book2);

function square(x){
    let y = x * x;
    return y;
}

console.log(square(2)); // effettua il quadrato di 2

// let cube = function c(x){
//     let y = square(x) = x;
//     return y;
// }



let fourth = x => square(x) * square(x);

let n = fourth(2);

console.log(n);



