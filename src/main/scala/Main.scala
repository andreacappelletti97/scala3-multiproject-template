
import ProjectA.MainProjectA
import ProjectB.MainProjectB

object Main:
  @main def hello: Unit =
    println("Hello from the orchestrator!")
    println(MainProjectA.message)
    println(MainProjectB.message)

