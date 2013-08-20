package com.thoughtworks.models

abstract class Command(c: Char) {
  def executeOn(r: Rover): Unit
  override def toString = c toString
}

case object Left extends Command('L') {
  def executeOn(rover: Rover) = rover turnLeft
}

case object Right extends Command('R') {
  def executeOn(rover: Rover) = rover turnRight
}

case object Move extends Command('M') {
  def executeOn(rover: Rover) = rover moveForward
}

case class Mission(val commands: List[Command]) {
  
  def start(plateau: Plateau, rover: Rover) = {
    
    commands.foreach { command =>
      if (!rover.died) {
		val move = (rover.currentPosition, rover.currentOrientation, command)
		if (plateau doNotHaveWarningFor move) {
		  command executeOn rover
		}
		  
		if (plateau doNotHave(rover.currentPosition)) {
		  rover.died = true
		  plateau markAsThreatening move
		}
      }
    }
  }
}