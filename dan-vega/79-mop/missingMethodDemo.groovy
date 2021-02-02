class Foo {
  def calls = []
  
  def notMissing1() { this }
  def notMissing2 = { this }
  
  def methodMissing(String name, args) {
    println "Entered missing method: $name"
    calls << name
    return { this }
  }
}

def foo = new Foo()

println foo
  .bar()
  .notMissing1()
  .notMissing2()
  .baz()
  .getCalls()
