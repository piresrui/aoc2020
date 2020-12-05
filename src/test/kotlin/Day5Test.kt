package test.kotlin

import aoc2020.Day5
import helpers.Helpers
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day5Test {

    @Test
    fun testChallengeOneFunction() {

        val input = Helpers.getFileResources("day5_test.txt")
        val seatId = Day5().challengeOne(input)

        assertEquals(820, seatId)

    }

    @Test
    fun testChallengeOne() {
        val input = Helpers.getFileResources("day5_rui.txt")
        val seatId = Day5().challengeOne(input)

        println("$seatId")
        assert(true)
    }

    @Test
    fun testChallengeTwo() {
        val input = Helpers.getFileResources("day5_rui.txt")
        val seatId = Day5().challengeTwo(input)

        println("$seatId")
        assert(true)
    }

}