import groovy.transform.AutoClone
import groovy.test.GroovyAssert

class Person {
  String first, last
}

@AutoClone
class ClonablePerson {
  String first, last
}

def ex = GroovyAssert.shouldFail {
  new Person(first: "Adam", last: "Smith").clone()
}

println "Failed to clone a Person:\n$ex\n\n"

def cp = new ClonablePerson(first: "Adam", last: "Smith")
def cpc = cp.clone()

println "Cloned: $cpc.first $cpc.last"


