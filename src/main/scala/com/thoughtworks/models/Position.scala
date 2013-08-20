package com.thoughtworks.models

case class Position(x: Int, y: Int) {
  def addY = Position(x, y + 1)
  def subY = Position(x, y - 1)
  def addX = Position(x + 1, y)
  def subX = Position(x - 1, y)
  
  override def toString = s"(${x}, ${y})" 
}