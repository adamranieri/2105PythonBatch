
something = "Global"

let obj = {
    something:"inside the object",
    wasssup: function(){
        console.log(this.something)
        function inner(){
            console.log(this.something)
        }
        inner()
    }
}

obj.wasssup()