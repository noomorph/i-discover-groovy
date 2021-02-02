class Point extends Expando {
  void setProperty(String name, value) {
    def castValue = name.size() == 1
      ? value as double
      : value

    this.metaClass."$name" = castValue
  }
}

def p = new Point()

p.x = '3.2'
p.y = '4.4'
p.foo = 'bar'

assert p.x.class == Double
assert p.y.class == Double
assert p.foo == 'bar'
assert p.hoo == null
