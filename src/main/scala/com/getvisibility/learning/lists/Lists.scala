package com.getvisibility.learning.lists

import scala.annotation.tailrec

object Lists {

  @tailrec
  def last[T](input: List[T]): T = input match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case _ => throw new NoSuchElementException
  }

  def length[T](input: List[T]): Int = {

    @tailrec
    def calculateLength(currentLength: Int, input: List[T]): Int = input match {
      case Nil => currentLength
      case x :: xs => calculateLength(currentLength + 1, xs)
    }

    calculateLength(0, input)
  }
}
