// Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
// Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
// A class inherits a superclass when you specify the : SuperclassName() after its name. The empty parentheses () indicate an invocation of the superclass default constructor.
// Overriding methods or attributes requires the override modifier.

// kotlinc post.kt -include-runtime -d post.jar
// java -jar post.jar

// traditional object-oriented inheritance

open class Dog { 
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

// Inheritance with Parameterized Constructor

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

// Passing Constructor Arguments to Superclass

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}