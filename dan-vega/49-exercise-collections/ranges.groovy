enum DayOfWeek {
  Sunday,
  Monday,
  Tuesday,
  Wednesday,
  Thursday,
  Friday,
  Saturday,
}

def workingDays = DayOfWeek.Monday..DayOfWeek.Friday;

println "There are ${workingDays.size()} working days"
println "${DayOfWeek.Wednesday} ${workingDays.contains(DayOfWeek.Wednesday) ? 'is' : 'is not'} a working day"
println "The first working day is ${workingDays.from}"
println "The last working day is ${workingDays.to}"
