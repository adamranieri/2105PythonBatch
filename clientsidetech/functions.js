// Like every programming language JS has functions
// there are a few ways to define functions
// Good JS should have semicolons
// JS will auto insert ; to it's best ability
// works 99% of time and the other 1% will cost you hours of debugging

// function keyword
function hello(name){ 

    console.log("Hello " + name);
}

hello("Adam")

// storing the function in a variable
const hola = function(nombre){
    console.log("Hola " + nombre);
}

hola("Tim")

// arrow notation DOES NOT use the function keyword
// there are minor differences between function and arrow notation
const gutentag = (name) => {
    console.log("Gutentag " + name);
}

// functions in JS can be invoked with ANY number of arguments

function add(num1, num2){
    return num1+num2;
}

// ALL of this is valid JS. It will NOT throw an error
let sum = add() // calling a function with too few parameters will give the parameters a
// default value of undefined
console.log(sum)

sum = add(100)
console.log(sum)

sum = add(100,200)
console.log(sum)

sum = add(100,200,300) // any excess parameters are ignored
console.log(sum)

// JS DOES NOT have type annotations BUT it default arguments
// that can give your functions intellisense and be a bit more robust
function bonjour(napel = "Jacque"){
    console.log("Bonjour " + napel)
}