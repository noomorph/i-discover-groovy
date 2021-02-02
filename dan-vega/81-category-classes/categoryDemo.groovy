def foo() {
  println "Hello".shout()
}

class StringCategory {
  static String shout(String str) {
    "${str.toUpperCase()}!"
  }
}

use (StringCategory) { foo() }
