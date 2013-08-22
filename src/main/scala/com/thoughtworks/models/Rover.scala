package com.thoughtworks.models

case class Rover(
    private var position: Position = Position(0, 0),
    private var orientation: Orientation = East,
    mission: Mission = Mission(Nil)) {
  
  var died = false
  
  def turnLeft = { orientation = orientation left }
  def turnRight = { orientation = orientation right }
  def moveForward = { position = orientation.forward(position) }
  def executeMissionAt(p: Plateau) = mission start(p, this)
  def currentPosition = position
  def currentOrientation = orientation
  
  override def toString =
    s"{${currentPosition}, ${currentOrientation}, ${mission}}" 
}