open class Human (var firstName : String, var lastName : String, var age : Int) {
    /*
    init {
        this.firstName = "John"
        this.lastName = "Doe"
        this.age = 27
        }
    */
    open fun p () {
        println(this.firstName + "  " + this.lastName + ", " + this.age + " ans")
    }

    fun set_firstName (name : String) {
        this.firstName = name
    }

}


class Man (firstName : String, lastName : String, age : Int) : Human(firstName, lastName, age) {
    override fun p () {
        println("oskour")
    }
}


fun main () {
    val t = Human("prenpù", "r", 2)
    t.p()
    t.set_firstName("Patricia")
    t.p()
    val s = Man("pompidou", "on s'en fout ca va pas d'afficher", 3)
    s.p()
}