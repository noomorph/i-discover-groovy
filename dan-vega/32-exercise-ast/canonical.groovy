import groovy.transform.*

@Canonical
class Point {
  double x, y
}

def p23 = new Point(2, 3)
def p33 = new Point(3, 3)

assert p23 != p33
p33.x = 2
assert p23 == p33

println p23
