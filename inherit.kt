// Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
// Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
// A class inherits a superclass when you specify the : SuperclassName() after its name. The empty parentheses () indicate an invocation of the superclass default constructor.
// Overriding methods or attributes requires the override modifier.

// kotlinc post.kt -include-runtime -d post.jar
// java -jar post.jar

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

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}