class Foo {
  def x = 3

  def propertyMissing(String name) {
    "Foo.$name"
  }
}

def foo = new Foo()
println "Foo.x = $foo.x"
println "Foo.y = $foo.y"
