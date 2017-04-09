package tornadofx.tests

import javafx.collections.FXCollections
import tornadofx.*

class Person(name: String, age: Int) {
    constructor() : this("", 18)

    var name: String by property(name)
    fun nameProperty() = getProperty(Person::name)

    var phone: String by property(phone)
    fun phoneProperty() = getProperty(Person::phone)

    var email: String by property(email)
    fun emailProperty() = getProperty(Person::email)

    var age by property(age)
    fun ageProperty() = getProperty(Person::age)

    var parent by property<Person>()
    fun parentProperty() = getProperty(Person::parent)

    val children = FXCollections.observableArrayList<Person>()

    override fun toString() = name
}