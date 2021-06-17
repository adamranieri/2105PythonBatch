# HTTP Review
### Hyper Text Transfer Protocol
- http is the main form of communication on the internet
- Request reponse based system
    - you will always get back a response saying how your request was processed

### HTTP Request
- HTTP Version
- URL
    - where it is going
- Verb
    - What type of request it is
- Headers
    - meta infomation about the request
- Body
    - the main content you are sending

### Verbs
- GET
    - Cannot have a body
- POST
- PUT
- DELETE
- PATCH

### HTTP Response
- HTTP Version
- Headers
- Body
- Status code (How it was processed)
    - 100s
        - information
    - 200s
        - successes
    - 300s
        - redirects
    - 400s
        - client errors
    - 500s
        - web server error (very bad)

### JSON
- JavaScript Object Notation
- IT IS JUST A FORMATTED STRING
- Primary way of sending information around the web
    - every programming languages can use strings
    - Very easy for machines to parse
- Rules of JSON
- Naming SHOULD follow JS naming conventions
    - camelCase
    - firstName
- JSON only has three data types for values
    - string
    - number
    - boolean
- "KEY":value
    - if value is string "KEY": "value"
    - if value is number no quoutes
    - if values is boolean no quotes

```json
{
    "name":"Adam",
    "age":20,
    "profession": "Trainer", 
    "languages":["Java", "JS", "Python"]
}
```

