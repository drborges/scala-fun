package com.thoughtworks.models

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers
import java.text.MessageFormat

class OrientationSpec extends FunSpec with ShouldMatchers {

  describe("When facing North") {

    it("turning left makes it face West") {
      North.left should equal (West)
    }

    it("turning right makes it face East") {
      North.right should equal (East)
    }
    
    it("moving forward adds one unit to Y axis") {
      North.forward(Position(2, 2)) should equal (Position(2, 3))
    }
  }

  describe("When facing West") {

    it("turning left makes it face South") {
      West.left should equal (South)
    }

    it("turning right makes it face North") {
      West.right should equal (North)
    }

    it("moving forward decreases one unit from X axis") {
      West.forward(Position(2, 2)) should equal (Position(1, 2))
    }
  }

  describe("When facing South") {

    it("turning left makes it face East") {
      South.left should equal (East)
    }

    it("turning right makes it face West") {
      South.right should equal (West)
    }

    it("moving forward decreases one unit from Y axis") {
      South.forward(Position(2, 2)) should equal (Position(2, 1))
    }
  }

  describe("When facing East") {

    it("turning left makes it face North") {
      East.left should equal (North)
    }

    it("turning right makes it face South") {
      East.right should equal (South)
    }

    it("moving forward adds one unit to X axis") {
      East.forward(Position(2, 2)) should equal (Position(3, 2))
    }
  }
}