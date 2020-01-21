package com.getvisibility.learning.lists

import org.scalatest.wordspec.AnyWordSpec

class ListsTest extends AnyWordSpec {
  "A list of integers" when {
    "populated" should {
      "return its last element" in {
        assert(Lists.last(List(1, 3, 7)) == 7)
      }
      "do nothing for an already flat list" in {
        assert(Lists.flatten(List(1, 2, 3)) == List(1, 2, 3))
      }
    }
    "empty" should {
      "fail when asked for its last element" in {
        assertThrows[NoSuchElementException] {
          Lists.last(List.empty[Int])
        }
      }
      "return an empty list when flattened" in {
        assert(Lists.flatten(List()) == List())
      }
    }
    "A nested list of integers" should {
      "flatten its internal list" in {
        assert(Lists.flatten(List(List(1, 2, 3))) == List(1, 2, 3))
      }
    }
    "A nested list of mixed integers and lists" should {
      "flatten its internal lists" in {
        assert(Lists.flatten(List(1, List(1, 2))) == List(1, 1, 2))
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
}
