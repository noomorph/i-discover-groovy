class Point {
  def x = 0
  def y = 0

  void setProperty(String name, value) {
    this.@"$name" = value as double
  }
}

def p = new Point()

assert p.x.class == Integer
assert p.y.class == Integer

p.x = '3.2'
p.y = '4.4'

assert p.x.class == Double
assert p.y.class == Double

p.setX('3.2')
p.setY('4.4')

assert p.x.class == String
assert p.y.class == String

