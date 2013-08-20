package com.thoughtworks.models

case class Plateau(w: Int, h: Int) {
  type Move = (Position, Orientation, Command)
 
  private var threateningMoves: List[Move] = Nil
  private def outOfHorizontalBounds(x: Int) = !(x > 0 && x <= w)
  private def outOfVerticalBounds(y: Int) = !(y > 0 && y <= h)
  
  def doNotHave(p: Position) =
    outOfHorizontalBounds(p.x) || outOfVerticalBounds(p.y)
    
  def markAsThreatening(move: Move): Plateau = {
    threateningMoves = move :: threateningMoves
    this
  }
    
  def doNotHaveWarningFor(move: Move) =
    !threateningMoves.contains(move)
  
  override def toString = s"{w: ${w}, h: ${h}, ${threateningMoves}}"
}