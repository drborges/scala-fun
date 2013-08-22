package com.thoughtworks.models

case class Mission(val commands: List[Command]) {
  
  def start(plateau: Plateau, rover: Rover) = {
    
    commands.foreach { command =>
      if (!rover.died) {
        
		val move = (rover.currentPosition, rover.currentOrientation, command)
		if (plateau doNotHaveWarningFor move) {
		  command apply rover
		}
		  
		if (plateau doNotHave(rover.currentPosition)) {
		  rover.died = true
		  plateau markAsThreatening move
		}
      }
    }
  }
}