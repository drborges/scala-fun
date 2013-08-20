package com.thoughtworks.models

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

class OrientationSpec extends FunSpec with ShouldMatchers {

  describe("When facing North") {
    val orientation = North

    it("turning left makes it face West") {
      orientation.left should equal(West)
    }

    it("turning right makes it face East") {
      orientation.right should equal(East)
    }

    it("moving forward adds one unit to Y axis") {
      orientation.forward(Position(2, 2)) should equal(Position(2, 3))
    }
  }

  describe("When facing West") {
    val orientation = West

    it("turning left makes it face South") {
      orientation.left should equal(South)
    }

    it("turning right makes it face North") {
      orientation.right should equal(North)
    }

    it("moving forward decreases one unit from X axis") {
      orientation.forward(Position(2, 2)) should equal(Position(1, 2))
    }
  }

  describe("When facing South") {
    val orientation = South

    it("turning left makes it face East") {
      orientation.left should equal(East)
    }

    it("turning right makes it face West") {
      orientation.right should equal(West)
    }

    it("moving forward decreases one unit from Y axis") {
      orientation.forward(Position(2, 2)) should equal(Position(2, 1))
    }
  }

  describe("When facing East") {
    val orientation = East

    it("turning left makes it face North") {
      orientation.left should equal(North)
    }

    it("turning right makes it face South") {
      orientation.right should equal(South)
    }

    it("moving forward adds one unit to X axis") {
      orientation.forward(Position(2, 2)) should equal(Position(3, 2))
    }
  }
}