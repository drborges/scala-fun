package com.thoughtworks.models

import java.lang.Error

abstract class Orientation(o: Char) {
  def left: Orientation
  def right: Orientation
  def forward(p: Position): Position
  override def toString = o toString
}

case object North extends Orientation('N') {
  def left = West
  def right = East
  def forward(p: Position) = p addY
}

case object West extends Orientation('W') {
  def left = South
  def right = North
  def forward(p: Position) = p subX
}

case object East extends Orientation('E') {
  def left = North
  def right = South
  def forward(p: Position) = p addX
}

case object South extends Orientation('S') {
  def left = East
  def right = West
  def forward(p: Position) = p subY
}