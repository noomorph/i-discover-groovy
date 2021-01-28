List days = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']

println 'Printing the days:'
days.eachWithIndex { day, index -> println "Day ${index + 1}: $day" }

println "Overall, there are ${days.size()} days"

days.removeAt days.indexOf('Sat') // or: days -= 'Sat'

println "Without Sat: $days"

days.addAll days.indexOf('Fri') + 1, ['Sat'] // or: days << 'Sat' days += 'Sat'

println "Sat is back: $days"
