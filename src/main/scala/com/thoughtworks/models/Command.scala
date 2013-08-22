package com.thoughtworks.models

abstract class Command(c: Char) {
  def apply(r: Rover): Unit
  override def toString = c toString
}

case object Left extends Command('L') {
  def apply(rover: Rover) = rover turnLeft
}

case object Right extends Command('R') {
  def apply(rover: Rover) = rover turnRight
}

case object Move extends Command('M') {
  def apply(rover: Rover) = rover moveForward
}