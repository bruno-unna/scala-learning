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
   *
   * @param input possibly nested list
   * @return flattened list
   */
  def flatten(input: List[Any]): List[Any] = input match {
    case Nil => Nil
    case x :: xs => x match {
      case y: List[Any] => y ++ flatten(xs)
      case _ => x :: flatten(xs)
    }
  }

  /** Pack consecutive duplicates of list elements into sublists.
   * If a list contains repeated elements they should be placed in separate sublists.
   *
   * @param input list with potentially repeated subsequences
   * @tparam T type of elements of the list
   * @return list with lists containing the discovered subsequences
   */
  def pack[T](input: List[T]): List[List[T]] = ???

}
