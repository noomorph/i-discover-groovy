def transform(List elements, Closure action) {                    
    def result = []
    elements.each {
        result << action(it)
    }
    result
}

 def describe(p) {                                       
    "$p.name is $p.age"
}

def list = [
    [name: 'Bob',   age: 42],
    [name: 'Julia', age: 35]
]

println transform(list, this.&describe)
