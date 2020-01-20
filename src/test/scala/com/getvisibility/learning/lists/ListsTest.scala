package com.getvisibility.learning.lists

import org.scalatest.wordspec.AnyWordSpec

class ListsTest extends AnyWordSpec {
  "A list of integers" when {
    "populated" should {
      "return its last element" in {
        assert(Lists.last(List(1, 3, 7)) == 7)
      }
    }
  }
}
