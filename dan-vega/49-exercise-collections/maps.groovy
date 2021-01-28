def days = [
  1: 'Sunday',
  2: 'Monday',
  3: 'Tuesday',
  4: 'Wednesday',
  5: 'Thursday',
  6: 'Friday',
  7: 'Saturday',
]

days.each {
  println "Day $it.key is $it.value"
}

println()
println "days is ${days.getClass().name}"
println "There are ${days.size()} days"
println "The map values are: ${days.values()}"



