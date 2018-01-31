class Person {

  var age: Int = 0

  def this(initialAge:Int) = {
    this()
    age = initialAge
    if(this.age < 0){
      System.out.println("Age is not valid, setting age to 0.")
      age = 0
    }
  }

  def amIOld(): Unit = {
    // Do some computations in here and print out the correct statement to the console
    if(age < 13){
      System.out.println("You are young.")
    } else if(age < 18){
      System.out.println("You are a teenager.")
    }else{
      System.out.println("You are old.")
    }
  }

  def yearPasses(): Unit = {
    // Increment the age of the person in here
    age += 1
  }

}
