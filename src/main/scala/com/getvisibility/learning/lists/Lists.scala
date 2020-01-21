package com.getvisibility.learning.lists

import scala.annotation.tailrec

object Lists {

  /** Finds and return last element of the list.
   *
   * @param input list whose length is interesting
   * @tparam T type of the elements of the list
   * @return return last element of the list
   */
  @tailrec
  def last[T](input: List[T]): T = input match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case _ => throw new NoSuchElementException
  }

  /** Calculate the length of a given list.
   *
   * @param input list whose length is interesting
   * @tparam T type of the elements of the list
   * @return length of the list
   */
  def length[T](input: List[T]): Int = {
    @tailrec
    def recursiveLength(currentLength: Int, input: List[T]): Int = input match {
      case Nil => currentLength
      case x :: xs => recursiveLength(currentLength + 1, xs)
    }

    recursiveLength(0, input)
  }

  /** Flatten a nested list structure.
   */
  def flatten(input: List[Any]): List[Any] = ???
}
