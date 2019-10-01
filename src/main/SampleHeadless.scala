package org.nlogo.controllingapisample

import java.awt.EventQueue

import org.nlogo.headless.HeadlessWorkspace

object SampleHeadless {

  def main( args: Array[String] ) {
    oneWorkspace()
    twoWorkspaces()
  }

  def oneWorkspace() {
    val workspace = HeadlessWorkspace.newInstance
    workspace.open( "/Applications/NetLogo 6.1.1/models/Sample Models/Earth Science/Fire.nlogo" )

    workspace.command( "set density 62" )
    workspace.command( "random-seed 0" )
    workspace.command( "setup" )

    var i = 0
    while ( i < 500 ) {
      workspace.command( "go" )
      i = i + 1
    }

    println( workspace.report( "burned-trees" ) )
  }

  def twoWorkspaces() {
    val workspace1 = HeadlessWorkspace.newInstance
    workspace1.open( "/Applications/NetLogo 6.1.1/models/Sample Models/Earth Science/Fire.nlogo" )
    val workspace2 = HeadlessWorkspace.newInstance
    workspace2.open( "/Applications/NetLogo 6.1.1/models/Sample Models/Biology/Slime.nlogo" )

    workspace1.command( "set density 62" )
    workspace2.command( "set population 1000" )
    workspace1.command( "random-seed 0" )
    workspace2.command( "random-seed 0" )
    workspace1.command( "setup" )
    workspace2.command( "setup" )

    (1 to 500).foreach( _ => {
      workspace1.command( "go" )
      workspace2.command( "go" )
    })

    println( workspace1.report( "burned-trees" ) )
    println( workspace2.report( "mean [xcor] of turtles" ) )
  }
}
