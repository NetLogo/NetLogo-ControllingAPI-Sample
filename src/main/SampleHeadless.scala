package org.nlogo.controllingapisample

import java.awt.EventQueue

import org.nlogo.headless.HeadlessWorkspace

object SampleHeadless {

  def main( args: Array[String] ) {

    val workspace = HeadlessWorkspace.newInstance
    workspace.open( "/Applications/NetLogo 6.1.0/models/Sample Models/Earth Science/Fire.nlogo" )

    workspace.command( "set density 62" )
    workspace.command( "random-seed 0" )
    workspace.command( "setup" )

    var i = 0
    var isPaused = false
    while ( i < 500 ) {
      if ( !isPaused ) { workspace.command( "go" ) }
      i = i + 1
    }

    println( workspace.report( "burned-trees" ) )

  }
}
