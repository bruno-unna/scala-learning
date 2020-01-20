package com.getvisibility.learning.lists

import org.scalatest.wordspec.AnyWordSpec

class ListsTest extends AnyWordSpec {
  "A list of integers" when {
    "populated" should {
      "return its last element" in {
        assert(Lists.last(List(1, 3, 7)) == 7)
      }
    }
    "empty" should {
      "fail when asked for its last element" in {
        assertThrows[NoSuchElementException] {
          Lists.last(List.empty[Int])
        }
      }
    }
  }
  "A list of chars" when {
    "populated" should {
      "return its last element" in {
        assert(Lists.last(List("a", "b", "c")) == "c")
      }
    }
  }
}
