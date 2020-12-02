package test.kotlin

import aoc2020.Day1
import helpers.Helpers
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Day1Test {

    @Test
    fun testChallengeOneFunction() {

        val input = listOf(1721, 979, 366, 299, 675, 1456)

        val (a, b) = Day1().challengeOne(input, 2020)

        assertEquals(2020, a + b)
        assertEquals(514579, a * b)
    }

    @Test
    fun testChallengeOne() {
        val input = Helpers.getFileResources("day1_luis.txt").map { it.toInt() }
        val (a, b) = Day1().challengeOne(input, 2020)

        println("Pair is $a, $b : ${a*b}")
        assert(true)
    }

    @Test
    fun testChallengeTwoFunction() {
        val input = listOf(1721, 979, 366, 299, 675, 1456)

        val mult = Day1().challengeTwo(input, 2020)

        assertEquals(241861950, mult)
    }

    @Test
    fun testChallengeTwo() {
        val input = Helpers.getFileResources("day1_luis.txt").map { it.toInt() }
        val mult = Day1().challengeTwo(input, 2020)

        println(mult)
        assert(true)
    }
}
