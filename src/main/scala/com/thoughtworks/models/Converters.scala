package com.thoughtworks.models

object Converters {
  implicit def charToOrientation(o: Char): Orientation = o match {
    case 'N' => North
    case 'W' => West
    case 'E' => East
    case 'S' => South
    case _ => throw new Error(s"Unkown orientation: ${o}")
  }
}