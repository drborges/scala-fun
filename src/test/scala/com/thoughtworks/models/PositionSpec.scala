package com.thoughtworks.models

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec

class PositionSpec extends FunSpec with ShouldMatchers {

  describe("Position changing") {
    
    it("adds one unit to X axis") {
      Position(2, 2).addX should equal(Position(3, 2))
    }
    
    it("adds one unit to Y axis") {
      Position(2, 2).addY should equal(Position(2, 3))
    }
    
    it("decreases one unit from X axis") {
      Position(2, 2).subX should equal(Position(1, 2))
    }
    
    it("decreases one unit from Y axis") {
      Position(2, 2).subY should equal(Position(2, 1))
    }
  }
}