// JS has EXTREMELY aggressive type coercion
// JS will compare apple to oranges even if they are both bananas

console.log(100 == 100)// true
console.log(100 == "100")// true JS will coerce the string into a number then compare the values
console.log(10 == false)// false
console.log(10 == true)// true
console.log("" == false * 1)// true
console.log(90/"hello" == false/true)// false
let a = 90/"hello"
console.log(a) // NaN not a number
console.log(typeof(a))// not a number is of type number
let b = 90/"hello"
console.log(a == b)// false
console.log(a == a)// false NaN is always FALSE in an evaluation
console.log(a != a)// true

// There are some inherent falsy values
// values that coerce to false
console.log(Boolean("")) 
console.log(Boolean(0))
console.log(Boolean(null))
console.log(Boolean(undefined))
console.log(Boolean(NaN))
// every other value in JS will be TRUE in a comparsion
console.log(Boolean("0")) // true
console.log(Boolean("0"- 0)) // false

console.log("100"-0 + ("100"- 0))// JS level 99999
// == loose equality operator
// you should not use. it will coerce values before checking equality
// === strict equality will also check to see of same type
console.log(100 === "100")// false
console.log(100 == "100")// true

// there is no transitive property of type coercion
console.log("0"==0)// true
console.log(0 == false) // true
console.log("0" == false) // false