@groovy.transform.ToString()
class Person {
  def name 
}

@groovy.transform.ToString(includeSuper=true)
class Student extends Person {
  def faculty
}

def p = new Student(name: "Adam", faculty: "Computer Science")
println p
