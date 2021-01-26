import groovy.transform.TypeChecked
import static groovy.test.GroovyAssert.shouldFail

class Point {
  int x, y

  @TypeChecked
  Point(int x, int y) {
    this.x = x
    this.y = y
  }
}

def ex = shouldFail(GroovyRuntimeException) { new Point(null, null) }
assert ex ==~ /.*Could not find matching constructor.*/

new Point(2, 3)
