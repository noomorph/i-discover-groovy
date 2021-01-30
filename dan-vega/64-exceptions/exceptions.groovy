class MyException extends Exception {
  MyException(msg) {
    super("$author: $msg")
  }

  static final author = "Yaroslav"
}

def foo() throws MyException {
  throw new Exception("Hello!");
}

try {
  foo()
} catch (MyException e) {
  println "Caught my exception"
  println e
} catch (Exception e) {
  println e
} finally {
  println "Finally!"
}
