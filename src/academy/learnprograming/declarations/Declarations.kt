package academy.learnprograming.declarations
typealias EmployeeSet = Set<Employee>


fun main(args: Array<String>) {
   val number: Int
    number = 10
    //number = 20

    val names= arrayListOf("John", "Jane", "Mary")
    println(names[1])

    val employee:EmployeeSet

    val employee1= Employee("Lynn Jones", 500)
    employee1.name= "Lynn Smith"

    val employee2: Employee
    val number2 = 100

    if(number<number2){
        employee2= Employee("Jane Smith", 400)
    }else{
        employee2= Employee("Mike Watson", 150)

    }
}

class Employee(var name: String, val id: Int) {
    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}
