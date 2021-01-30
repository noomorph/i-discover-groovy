class MyWriter {
  private String buffer = ''

  def append(s) {
    buffer += s
  }
}

def writer(Closure c) {
  c.delegate = new MyWriter();
  c.resolutionStrategy = Closure.DELEGATE_ONLY;
  c()
}

println writer {
  append 'Dan '
  append 'is a student. '
}

