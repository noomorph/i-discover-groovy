class Foo {
  def x() { 3 }
  def y = { 4 }

  def invokeMethod(String name, Object args) {
    println "Could not find foo.$name"
    5
  }
}

def foo = new Foo()
println "Foo.x() = ${foo.x()}"
println "Foo.y() = ${foo.y()}"
println "Foo.z() = ${foo.z()}"
