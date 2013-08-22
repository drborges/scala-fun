package com.thoughtworks.models

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import org.scalamock.Mock

class CommandSpec extends FunSpec
	with ShouldMatchers
	with BeforeAndAfter {
  
  var rover: Rover = _
  
  describe("Commands") {
	
    before {
      rover = new Rover
    }
	
    it("Left command tells Rover to turn left") {
      Left(rover)
      
      rover.currentOrientation should be (North)
    }
    
    it("Right command tells Rover to turn right") {
      Right(rover)
      
      rover.currentOrientation should be (South)
    }
    
    it("Move command tells Rover to move forward one unit") {
      Move(rover)
      
      rover.currentPosition should be (Position(1, 0))
    }
  }
} 