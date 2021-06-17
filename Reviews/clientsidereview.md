# Client Side Review
- Client side/ front end technologies that make up your web browser
- Web Browser has to have 3 main things
    - make HTTP requests
    - HTML/CSS renderer
    - JS engine

## Pillars of Client of Client side technology
- HTML
    - Content and structure
- CSS
    - Styling and aesthetic 
- JavaScript
    - dynamic pages/ logic

### HTML
- NOT A PROGRAMMING LANGUAGE
- The minimum HTML tags for a page should be, <!Doctype HTML>,<html>, <head>,<body>
    - <head> meta information
        - <title>
        - <link>
    - <body> main content
    - <html> root tag that all other tags go inside of
```html
<!-- elements/tags and they can have attributes -->
<p>Random sentence </p>
<img src = "something.jpg">
```
### CSS
- NOT A PROGRAMMING LANGUAGE
- Cascading Style Sheets
    - Cascade algorithm determines what the ultimate CSS applied to an element is
    - General rule * the most specific CSS / closest CSS wins
- types of selectors
    - by tag
    - by id
    - by class
```css
/**selector {key:value; key:value} */
p {color:red}
```

# JavaScript
- The only programming lanugage in browsers
- High level language
    - no pointers automatic mempory management
- Asynchronous event-driven language
    - there is not multi-threading in JS
- Dynamic language (do not have to declar the types) Like Python
- Loosely Typed 
    - aggresive type coercion
    - JS will turn datatypes into other types implicityly
        - Python will not do this to you. 
- multi-paradigm (cake-salad)
    - functional 
    - OOP

### primitive data types
- Primitive is a semantic term
    - strings in JS are a primitive even though they are objects
- string
- number
- boolean
- null
    - explicit value meanining nothing
- undefined
    - default value of any variable in JS
- symbol
    - es6 data type I have never seen once in code

### Objects
- Objects are just key value pairs
    - anything can be a key 
    - anything can be a value
- Objects can be created without a class
    - object literal syntax
    - BY FAR the most common way to make objects
```js
const obj = {name:"Adam",age:20}
```
### Scopes
- JS has three different scopes
    - scopes are defined via key words
- (nothing) global scope
- var function scope   
    - never use
    - var variables can be hoisted
- let,const block scope
    - use let and const as much as you can

### Truthy Falsy
- JS has extremely aggressive type coercion
    - It will convert your datatypes rather than give you an error
- All values in JS are either inherently false or true
    - falsy values (they all represent "nothingness")
        - false
        - ""
        - 0
        - null
        - undefined
        - NaN
            - NaN is always false in comparisons
    - truthy values
        - everything else
- == loose equality operator
    - will coerce data types then check values
- === strict equality
    - will first check to see if the variables of the same type
    - ALWAYS USE 

### functions
- functions are objects in JS
- they can be stored in variables like any other object in JS
- types of functions to know
    - callback function
        - A function passed into another function as an argument
    - Higher order
        - A function recieves a callback function
    - arrow function
        - alternate syntax for defining functions
        - the only difference to the function key word is the binding of this
        - function this is dynamic
        - arrow notation this points to same variable no matter wher it is used
```js

function callback(){

}
function higherOrder(func){
    func()
}

higherOrder(callback)

```

### DOM
- Document Object Model
- Tree representation of the elements in an HTML page
    - JS was invented to maniuplate the DOM to make the page dynamic
- events
    - any interaction that can happen on a web page
    - hover over a link
    - click on button
    - mouseouver a heading
- eventListeners
```js
const button = document.getElementById("submitBtn")
button.addEventListener("click",functionToExecuteOnEvent)
```
### Template literals
```js
let name = "adam"
let greet = `Hello ${name}`
```

### asynchronous programming in JS
- Event-driven lanuage
- YOU DO NOT want to block the event queue
    - can happen if you call a method that takes a LONG time to finish
- A lot of methods get around this by returning PROMISE obects 
    - a promise is essentially an EMPTY object that one day will hold the value you want
- async await is a way to wait for these promises WITHOUT blocking the event queue
    - Write code that looks synchrous from a developer's perspectiv
    - in actuality your async functions are not synchronous and twiddling their thumbs during await
```js
async function getUser(){
    const user = await sendUserInfo("adamGator","password123")
}
```
### fetch API
- in built function for browsers
- allows us to create http requests
```js
const response = await fetch("url", {method:"POST", body:"usually some JSON"})
const body = await response.json()
```
