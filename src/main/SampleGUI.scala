package org.nlogo.controllingapisample

import java.awt.EventQueue

import org.nlogo.app.App

object SampleGUI {

  def main( args: Array[String] ) {

    App.main( args )
    wait {
      App.app.open( "../models/Sample Models/Earth Science/Fire.nlogo" )
    }
    App.app.command( "set density 62" )
    App.app.command( "random-seed 0" )
    App.app.command( "setup" )

    var i = 0
    while ( i < 500 ) {
      App.app.command( "go" )
      i = i + 1
    }

    println( App.app.report( "burned-trees" ) )

  }
  def wait( block: => Unit ) {
    EventQueue.invokeAndWait(
      new Runnable() { def run() { block } }
    )
  }
}
