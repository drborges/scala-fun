package com.thoughtworks.models

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

class ConvertersSpec extends FunSpec with ShouldMatchers {

  describe("charToOrientation converts") {

    it("from 'N' to North") {
      Converters.charToOrientation('N') should equal(North)
    }

    it("from 'W' to West") {
      Converters.charToOrientation('W') should equal(West)
    }

    it("from 'S' to South") {
      Converters.charToOrientation('S') should equal(South)
    }

    it("from 'E' to East") {
      Converters.charToOrientation('E') should equal(East)
    }
    
    it("throws an Error if orientation is unknown") {
      evaluating { Converters.charToOrientation('Z') } should produce [Error]
    }
  }
}