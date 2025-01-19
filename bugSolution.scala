```scala
class MyClass(val x: Int) {
  def this() = this(0) // Correct use of auxiliary constructor
  def getX = x
}

object Main extends App {
  val obj = new MyClass()
  val obj2 = new MyClass(5)
  println(obj.getX) // Output: 0
  println(obj2.getX) // Output: 5
}
```