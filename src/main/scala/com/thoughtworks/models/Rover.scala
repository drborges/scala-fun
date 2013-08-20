package com.thoughtworks.models

case class Rover(
    private var position: Position,
    private var orientation: Orientation,
    mission: Mission) {
  
  var died = false
  
  def turnLeft = { orientation = orientation left }
  def turnRight = { orientation = orientation right }
  def moveForward = { position = orientation.forward(position) }
  def executeMissionAt(p: Plateau) = mission start(p, this)
  def currentPosition = position
  def currentOrientation = orientation
  
  override def toString = s"{${currentPosition}, ${currentOrientation}, ${mission}}" 
}