package com.getvisibility.learning.lists

import scala.annotation.tailrec

object Lists {

  @tailrec
  def last[T](input: List[T]): T = input match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case _ => throw new NoSuchElementException
  }

  //  @tailrec
  def length[T](input: List[T]): Int = input match {
    case Nil => 0
    case x :: xs => 1 + length(xs)
  }
}
