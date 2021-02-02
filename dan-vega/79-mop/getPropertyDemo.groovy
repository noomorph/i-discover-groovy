class Foo {
  def x = 3

  def getProperty(String name) {
    metaClass.hasProperty(this, name)
      ? metaClass.getProperty(this, name)
      : "Foo.$name"
  }
}

def foo = new Foo()
println "Foo.x = $foo.x"
println "Foo.y = $foo.y"
