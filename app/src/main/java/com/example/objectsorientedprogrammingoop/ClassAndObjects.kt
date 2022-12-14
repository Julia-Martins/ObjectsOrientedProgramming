package com.example.objectsorientedprogrammingoop

import kotlin.math.floor

data class User(val id: Long, var name: String)

fun  main() {
// region Array
//    val numbers = intArrayOf(21, 72, 81)
//    val numbers = arrayOf(27, 79, 92)
//    val numbers = doubleArrayOf(27.1, 79.4, 92.0)
//    println("Initial values ${numbers.contentToString()}")
//    for(element in numbers){
//        println("${element +7}")
//    }
//    numbers[0] = 21.7
//    numbers[1] = 72.8
//    numbers[2] = 81.9
//    println("Latest values ${numbers.contentToString()}")

//    val mix = arrayOf("Julia", "Brasileiro", 20, "2002/09/21", 20, 0.00, "Developer")

//    println(mix.contentToString())

//    val fruits = arrayOf(fruit("Strawberry", 10.96), fruit("Sleeve", 8.90))
//    for (index in fruits.indices) {
//        println("${fruits[index].name} is in index $index")
//    }

//    for (fruit in fruits) {
//        println("${fruit.name}")
//    }

// endregion

// region Lists Part 1
//    val stringList: List<String> = listOf("Julia", "Thais", "Lucas", "Bruce", "Barbara")
//    val mixedTypeList: List<Any> = listOf("Julia", 21, 9, "Birthday", 101.0, "Weights", "Kg")
//
//    for (value in mixedTypeList) {
//        when (value) {
//            is Int -> {
//                println("Integer: '$value'")
//            }
//            is Double -> {
//                println("Double: '$value' with Floor value ${floor(value)}")
//            }
//            is String -> {
//                println("String: '$value' f length ${value.length}")
//            }
//            else -> {
//                println("Unknown Type")
//            }
//         Alternatively
//        if(value is Int){
//            println("Integer: $value")
//        }else if(value is Double){
//            println("Double: $value with Floor value ${floor(value)}")
//        }else if(value is String){
//            println("String: $value f length ${value.length}")
//        }else{
//            println("Unknown Type")
//        }
//        }
//        }
//        val obj1: Any = "Wolf and Seals are the best animals"
//        if (obj1 !is String) {
//            println("Not a String")
//        } else {
//            println("Found a String of Length ${obj1.length}")
//        }
//
//        val str1: String = obj1 as String
//        println(str1.length)
//
//        val obj2: Any = 2172
//        val str2: String? = obj2 as? String
//        println(str2)
//
//        val obj3: Any = 8172
//        val str3: String? = obj3 as? String
//        println(str3)
//    }
// endregion Par

// region List Part 2 and Mutable List
//    val months = listOf("January", "February", "March", "April", "May", "Jun", "July", "August")
//    val anuTypes = listOf("Julia", "Brasileiro", 20, true)
//
//    val additionalMonths = months.toMutableList()
//    val newMonths = arrayOf("September", "October", "November", "December")
//
//    additionalMonths.addAll(newMonths)
//    additionalMonths.add("Wolf")
//
//    println(additionalMonths)
//
//    val days = mutableListOf<String>("Mon", "Tue", "Wed", "Thu", "Fry")
//
//    days.add("Sun")
//    days.add(5, "Sat")
//    days.add(2, "Gargamel")
//    println(days)
//    days.removeAt(2)
//    println(days)

//    val removeList = mutableListOf<String>("Mon", "Tue")
//    days.removeAll(days)
//    println(days)
// endregion

// region Set and Maps
    val fruits = setOf("Dragon Fruit", "Boysenberry", "Grape", "Dragon Fruit")
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Mango")
    newFruits.add("Strawberry")
    //println(newFruits.toSortedSet())

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")

    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }

    val Fruits = mapOf("Not so good" to fruit("Grape", 2.6), "I don't like" to fruit("Water Mellow", 3.9), "Favorite" to fruit("Tangerine", 2.1))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"
    newDaysOfWeek[6] = "Saturday"
    newDaysOfWeek[7] = "Sunday"

    println(newDaysOfWeek.toSortedMap())

    println(Fruits.values)
// endregion

//     region Function USER
//    val user1 = User(1, "Júlia")
//    user1.name = "Bruce"
//    val user2 = User(1, "Bruce")
//
//    println(user1 == user2)
//
//    println("User Details: $user1")
//
//    val updatedUser = user1.copy(name="Bruce Wayne")
//    println(user1)
//    println(updatedUser)
//
//    println(updatedUser.component1())
//    println(updatedUser.component2())
//
//    val (id, name) = updatedUser
//
//    println("id = $id\name = $name")
//     endregion

//region CALL the parts of Exercise
/*
    val changeBattery = 42
    val mark = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    val mark1 = MobilePhone("IOS", "Apple", "iPhone 14 Plus")
    val mark2 = MobilePhone("Android", "Huawei", "Mate X S",)

    mark.chargeBattery(changeBattery)
*/
//endregion

// region CALL Function
//    var person = Person("Julia", "Brasileiro", 20)
//    person.hobby = "Read books"
//    person.stateHobby()
//    var batman = Person()
//    batman.hobby = "Training with Ra's Al Gu"
//    batman.stateHobby()

//    var myCar = Car()
//    println("${myCar.owner} ,${myCar.myBrand}")
//
//    myCar.maxSpeed = 781
//    println("Max speed is ${myCar.maxSpeed}")
//    println("Model is ${myCar.myModel}")
// endregion

// region Vehicle
//    var myVehicle = Car(200.00,"HB20", "Hyundai")
//    var myVehicleElectric = ElectricCar(250.00,"S-Model", "Tesla", 81.0)

//    myVehicleElectric.extendRange(200.0)
//    myVehicleElectric.drive()
//
//    myVehicle.brake()
//    myVehicleElectric.brake()

        // Polymorphism
//    myVehicle.drive(200.0)
//    myVehicleElectric.drive(200.0)

// endregion

// region Mammals
//    val human = Human("Júlia Brasileiro", "Brazil", 101.0, 20.0)
//    val wolf = Wolf("Ebony", "England", 38.0, 54.88)
//
//    human.run()
//    wolf.run()
//
//    human.breath()
//    wolf.breath()
// endregion
}
data class fruit(val name: String, val price: Double)

// region Class Car
//class Car(){
//    lateinit var owner : String
//
//    val myBrand: String = "Ferrari"
//    get() {
//        return field.toUpperCase()
//    }
//
//    var maxSpeed: Int = 172
//    set(val1){
//        field = if(val1 > 0) val1 else throw IllegalArgumentException("Max Speed cannot be less than 0")
//    }
//
//    var myModel = "M7"
//        private set
//
//    init {
//        myModel = "M21"
//        owner = "Christine"
//    }
// endregion

// region Class Person
//class Person(firstName: String = "Bruce", lastName: String = "Wayne"){
//    var age: Int? = null
//    var hobby: String = "Play Video Games"
//    var firstName: String? = null
//
//    init {
//        this.firstName = firstName
//        println("Welcome $firstName $lastName")
//    }
//
//    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName){
//        this.age = age
//
//        println("Welcome $firstName $lastName, you have ${this.age} years old")
//    }
//
//    fun stateHobby(){
//        println("$firstName\'s hobby is $hobby")
//    }
//endregion

// region EXERCISE
/* class MobilePhone(Name: String, Brand: String, Model: String){
    private var battery = 30

    init {
        println("You cellphone is a $Model, with the mark $Brand and it's a $Name")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery% and is at ${battery+chargedBy}% now")

        battery += chargedBy
    }
} */
// endregion

// region Interface Drivable
//    interface Drivable{
//        val maxSpeed: Double
//        fun drive(): String
//        fun brake(){
//            println("The drivable is braking")
//        }
//    }
// endregion

// region Class Vehicle

// Super Class
//open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
//    open var range: Double = 0.0
//
//    fun extendRange(amount: Double){
//        if(amount > 0){
//            range += amount
//        }
//    }

    // Form shortly to do a fun
//    override fun drive(): String = "Driving the interface drive"
//    override fun drive(): String {
//        return "Driving the interface drive"
//    }
//
//    open fun drive(distance: Double){
//        println("Drove for $distance KM")
//    }
//}

// Sub Class derived of Car
//class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
//    : Car(maxSpeed, name, brand){
//    override var range = batteryLife * 6
//
//    override fun drive(distance: Double){
//        println("Drove for $distance KM on electricity")
//    }
//
//    override fun drive() : String{
//        return "Drove for $range KM on electricity"
//    }
//
//    override fun brake() {
//        super.brake()
//    }
//}
// endregion

// region Abstract Class
//    abstract class Mammal(private val name: String, private val origin: String, private val weight: Double){
//        abstract var maxSpeed: Double
//
//        abstract fun run()
//        abstract fun breath()
//
//        fun displayDetails(){
//            println("Name: $name, Origin: $origin, Weight: $weight, Max Speed: $maxSpeed")
//        }
//    }
//
//class Human(name: String, origin: String, override var maxSpeed: Double, weight: Double): Mammal(name, origin, weight){
//    override fun run() {
//        println("Runs on two legs")
//    }
//
//    override fun breath() {
//        println("Breath through mouth or nose")
//    }
//
//}
//
//class Wolf(name: String, origin: String, override var maxSpeed: Double, weight: Double): Mammal(name, origin, weight){
//    override fun run() {
//        println("Runs on four legs")
//    }
//
//    override fun breath() {
//        println("Breath through mouth and sometimes nose")
//    }
//
//}
// endregion