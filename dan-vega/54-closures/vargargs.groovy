def concat = { ...args -> args.join('') }
def str = concat 'abc', 5, 'def'

def noop = {}

println str
println concat.maximumNumberOfParameters
println concat.parameterTypes

println noop.class.name


