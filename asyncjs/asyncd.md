# Asynchronous
- JavaScript is a single threaded language
- It can only EVER do one thing at a time
    - other langugaes can make multiple threads and do several operations simulataneously
- If you have some infinite JS loop your web page breaks 
- JavaScript cannot make threads but IS asynchronous and event driven
### CORS
- Cross Origin Resource Sharing
- CORS is a security protocol of browsers
    - JavaScript is not allowed to make HTTP requests to servers unless that server
    has specifically allowed it
    - By default JS can only make requests to webservers on the same domain
        - If you web application hosts its own html