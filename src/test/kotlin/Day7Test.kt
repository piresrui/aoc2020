package test.kotlin

import aoc2020.Day7
import helpers.Helpers
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day7Test {

    @Test
    fun challengeOneTestFunction() {
        val input = Helpers.getFileResources("day7_test.txt")

        val validBags = Day7().challengeOne(input)

        assertEquals(4, validBags)
    }

    @Test
    fun challengeOneTest() {
        val input = Helpers.getFileResources("day7_rui.txt")

        val validBags = Day7().challengeOne(input)

        println(validBags)
        assert(true)
    }

    @Test
    fun challengeTwoTestFunction() {
        val input = Helpers.getFileResources("day7_test2.txt")

        val validBags = Day7().challengeTwo(input)

        assertEquals(126, validBags)
    }

    @Test
    fun challengeTwoTest() {
        val input = Helpers.getFileResources("day7_rui.txt")

        val validBags = Day7().challengeTwo(input)

        println(validBags)
        assert(true)
    }

}