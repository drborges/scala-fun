package com.thoughtworks.models

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec

class PlateauSpec extends FunSpec with ShouldMatchers {

  describe("Positions out of plateau") {

    it("Position(5, 2) is out of Plateau(4, 2)") {
      Plateau(4, 2).doNotHave(Position(5, 2)) should be(true)
    }

    it("Position(4, 3) is out of Plateau(4, 2)") {
      Plateau(4, 2).doNotHave(Position(4, 3)) should be(true)
    }
  }

  describe("Threatening moves") {

    it("Plateau has threatening moves") {
      val plateau = Plateau(4, 2)
      val move = (Position(4, 2), North, Move)

      plateau.doNotHaveWarningFor(move) should be(true)

      plateau.markAsThreatening(move)
      	.doNotHaveWarningFor(move) should be(false)
    }
  }
}