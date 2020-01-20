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
  "A list of strings" when {
    "populated" should {
      "return its last element" in {
        assert(Lists.last(List("a", "b", "c")) == "c")
      }
      "return the number of elements" in {
        assert(Lists.length(List("one", "two", "three")) == 3)
        assert(Lists.length(List()) == 0)
      }
    }
  }

  // TODO please check that all methods have unit tests
}
