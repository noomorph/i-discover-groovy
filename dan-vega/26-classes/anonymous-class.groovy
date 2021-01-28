@groovy.transform.TupleConstructor
class Greeter {
  String name
}

def alice = new Greeter(name: "Alice")
println "Hello, $alice.name"

def bob = new Greeter() {
  def greet() {
    println "Hello, $name"
  }
}

bob.name = "Bob"
bob.greet()

def chuck = new Greeter(name: "Chuck") {
  def greet() {
    println "Hello, $name"
  }
}

chuck.greet();
