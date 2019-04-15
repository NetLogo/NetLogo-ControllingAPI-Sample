import java.awt.EventQueue

import org.nlogo.app.App

object Sample {
  def main(args: Array[String]) {
    App.main(args)
    wait {
      App.app.open("/Applications/NetLogo_6.1.0-RC2/models/Sample Models/Earth Science/Fire.nlogo")
    }
    App.app.command("set density 62")
    App.app.command("random-seed 0")
    App.app.command("setup")
    App.app.command("repeat 50 [ go ]")
    println(App.app.report("burned-trees"))
  }
  def wait(block: => Unit) {
    EventQueue.invokeAndWait(
      new Runnable() { def run() { block } } ) }
}
