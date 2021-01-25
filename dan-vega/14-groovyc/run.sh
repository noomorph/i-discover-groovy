#!/bin/sh

groovyc app.groovy
java -cp $HOME/.sdkman/candidates/groovy/current/embeddable/groovy-all-2.4.21.jar: app
