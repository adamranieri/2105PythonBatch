# What is a Web Browser
- Is an application for browsing the web
- Way for **humans** to communicate with computers and servers all over the world

### Core Components of a web browser
- HTML/CSS renderer
    - some way to read HTML and CSS and display the appropriate human readable web page
- JavaScript engine
    - JS is the one and ONLY language supported by web browsers and the internet
    - Chrome uses V8 (same engine that node.js)
    - JS is used for making web pages dynamic and doing any logic/programming
- HTTP mailer
    - Able to send HTTP requests and handle the HTTP responses

### Core Techonlogies of client side
- HTML
    - Hypertext Markup Language
    - Content and structure of a web page
- CSS
    - Cascading Style Sheets
    - Styling / aesthetics
        - colors
        - fonts
- JavaScript
    - programming language

## HTML
- HyperText Markup Language
- NOT A PROGRAMMING LANGUAGE
    - Not capable of logic
    - No functions or variables
- HTML is comprised of tags/elements
```html
    <h1>Hello Everybody</h1>
```
- common elements
    - <body>
    - <div>
    - <script>
    - <p>
    - <title>
    - <header>
    - <button>
    - <img>
    - <a>
    - <ol>, <ul>, <li>
    - <form> 
    - <h1> - <h6>
    - <input>
    - <footer>
    - <table>
- general syntax of an element
```html
<!--opening tag <x>content </x> -->
<p>Just some random stuff</p>

<!-- self closing tags are tags with a single set of <> -->
<hr/>

<!-- tags can have attributes which modify the element in some way -->
<p title="Adds a little tool tip when you hover over the paragraph" >more random stuff</p>
```

## CSS
- Cascading Style Sheets
- Responsible for making web pages look good
- NOT A PROGRAMMING LANUGAGE
- three ways to apply CSS to a page
    - inline
    - in the head tag
    - reference an external style sheet
- Cascade algorithm 
    - the in built CSS formula for determing what the ultimate CSS applied to an element
    - css selects can overlap
        - those bold tags are in a paragraph
    - The most tageted specific CSS is the one that is ultimate applied

### Tips for quick and easy CSS
- Use a CSS library designed by professional
    - bootstrap
- Google fonts 
    - for fancier custom styles
- The biggest HEADACHE in CSS is placing elemets in differents parts of a webpage
    - https://grid.layoutit.com/



