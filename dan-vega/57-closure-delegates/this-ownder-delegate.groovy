class ScopeDemo {
  def outerClosure = {
    // debugScope(this, owner, delegate)
  }

  static def staticClosure = {
    debugScope('ScopeDemo.staticClosure', this, owner, delegate)
    def inner = {
      debugScope('ScopeDemo.staticClosure.inner', this, owner, delegate)
    }

    inner()
  }

  def foo() {
    debugScope('ScopeDemo.foo', this, owner, delegate)
  }

  static def debugScope(...args) {
    println "${args[0]}"
    println "\tthis: ${args[1].toString()}"
    println "\towner: ${args[2].toString()}"
    println "\tdelegate: ${args[3].toString()}"
  }
}

ScopeDemo.staticClosure()
