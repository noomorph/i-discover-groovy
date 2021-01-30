def list = [1, 9, 3, 4]
def isEven = { it % 2 == 0 }
def isOdd = { it % 2 == 1 }

def allOds = list.findAll isOdd
def onlyEven = list.find isEven

assert allOds == [1, 9, 3]
assert onlyEven == 4

assert list.any(isOdd)
assert list.any(isEven)
assert !list.every(isOdd)
assert !list.every(isEven)

assert allOds.every(isOdd)
assert [onlyEven].every(isEven)

def hexes = [0x01, 0x02, 0x11, 0x12, 0x21, 0x33]

def byLittleByte = hexes.groupBy { it & 0xF }

assert byLittleByte == [
  1: [0x01, 0x11, 0x21],
  2: [0x02, 0x12],
  3: [0x33],
]
