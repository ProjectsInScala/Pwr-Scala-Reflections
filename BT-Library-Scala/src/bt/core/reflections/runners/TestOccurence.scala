package bt.core.reflections.runners
import bt.core.reflections.elementary.Point

object TestOccurence {
  def main(args: Array[String]){
    
    var samplePoint: Point = new Point(3,4)
    println("Exercise 1")
    samplePoint.debugName
    println()
    
    println("Exercise 2")
    samplePoint.debugVars
  }
}