def matcher = 'abc' =~ /\w/
println (matcher as List)
def matcher2 = 'abc' ==~ /\w{3}/
println (matcher2)


assert [1]
assert ![]
assert [1:1]
assert '!'
assert !''
assert (Boolean)1
assert !((Boolean)0)

assert new Object()
assert !(null as Boolean)
