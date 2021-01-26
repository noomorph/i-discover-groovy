package com.idiscovergroovy

import groovy.transform.ToString

@ToString()
class User2 {
    Long id
    String firstName
    String lastName
    String email
    Date dob

    void printFullName() {
        println "Full name: $firstName $lastName";
    }
}

//new com.idiscovergroovy.User2(firstName: "Micha", lastName: "Dobkin")
