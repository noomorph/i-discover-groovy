class Writer extends Expando {
  private def knownLanguages = new HashSet()

  def methodMissing(String name, args) {
    switch (name) {
      case ~/^teach\w*/:
        def language = name.split('teach')[1]
        knownLanguages.add(language)
        println "+5xp! Now I know $language!"
        break;
      case ~/^write\w*/:
        def language = name.split('write')[1]
        if (knownLanguages.contains(language)) {
          println "This is my first time I write in $language."
          getMetaClass()."write$language" = { Object[] theArgs ->
            println "Ho, I am well-versed in $language."
          }
        } else {
          println "Oops! I have no idea what $language is. :("
        }
        break;
      default:
        throw new MissingMethodException(name, this.class, args)
    }
  }
}


def tech = new Writer()

tech.teachC()
tech.writeJava()
tech.writeC()
tech.writeC()
