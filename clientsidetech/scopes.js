// JS does NOT have the same scoping as Python
// JS scopes are defined via KEYWORDS rather than location

// if you put NOTHING in front of a variable. the variable is of GLOBAL scope
function hello(){
    // name = "Adam" // name is a global variable!!!!!!
    var name = "Adam" // var makes the variable FUNCTION scope
    console.log(name)
}

hello()
console.log(name)

function hola(){
    console.log(nombre)
    var nombre = "James" // hoisting is a 'feature of JS'
    // BEFORE a function executes the var variables in it are given the value of undefined
    console.log(nombre)
}

hola()

// let and const keywords
// they are used to make variables BLOCK scoped
// CANNOT be hoisted

function bonjour(){
    {
    let napel = "Jaxon"
    // block scoped
    // name is only in the scope of the curly bracket
    }

    console.log("bonjour "+ napel)
}

//bonjour()

// use let and const. NEVER NEVER use var
// avoid global variables whenever possible

let x = 100
x = 90

// constant variables CANNOT be changed once assigned
// have the same scoping rules as let
const y = 1000
y = 900


