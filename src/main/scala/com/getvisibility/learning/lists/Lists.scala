package com.getvisibility.learning.lists

import scala.annotation.tailrec

object Lists {

  @tailrec
  def last[T](input: List[T]): T = input match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case _ => throw new NoSuchElementException
  }
}
