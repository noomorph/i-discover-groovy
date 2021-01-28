def rnd = new Random()
def x = rnd.nextInt(2) ?: -1
println x

def y = rnd.nextInt(2)
y ?= 2
println y
