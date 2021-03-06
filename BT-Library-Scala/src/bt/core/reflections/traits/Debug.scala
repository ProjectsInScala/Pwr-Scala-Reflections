package bt.core.reflections.traits
import java.lang.reflect.Field
import scala.reflect

trait Debug {
  def debugName = println("Klasa: " + getClass.getSimpleName)
  
  def debugVars = {
    var fields: Array[Field] = getClass.getDeclaredFields
      
    for(value : Field <- fields ) {
      var wasWaccessible = value isAccessible()
      value setAccessible true
      
      println("Pole: " + value.getName+ 
          " => " + value.getType.getTypeName+ 
          ", " + value.get(this))
      
      if ( !wasWaccessible )
        value setAccessible false      
    }
  }
}