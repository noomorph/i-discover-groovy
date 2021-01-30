def compose2 = { Closure f, Closure g ->
  { ...args -> f(g(*args)) }
}

def sqr = { x -> x ** 2 }
def sin = { x -> Math.sin(x) }
def sin2 = compose2(sin, sqr)

def forAnyX_assert = { x ->
  assert x*x == sqr(x)
  assert Math.sin(x) == sin(x)
  assert Math.sin(x*x) == sin2(x)
  println "Assertions: OK"
}

forAnyX_assert(0.1)


def aList = [1,2,3]
println "Squares (list): ${aList.collect(sqr)}"

def withValue = compose2.rcurry({ it.value })
def round2 = { BigDecimal x -> x.round(2) }
def (sqrValue, sinValue, sin2Value) = [sqr, sin, sin2].collect {
  compose2(round2, withValue(it))
}

def aMap = [a: 1, b: 2, c: 3]
println "x^2 (map): ${aMap.collect(sqrValue) }"
println "sin(x) (map): ${aMap.collect(sinValue) }"
println "sin(x^2) (map): ${aMap.collect(sin2Value) }"


