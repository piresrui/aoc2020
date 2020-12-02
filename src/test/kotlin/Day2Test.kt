package test.kotlin

import aoc2020.Day2
import helpers.Helpers
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day2Test {

    @Test
    fun testChallengeOneFunction() {
        val input = listOf("1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc")
        val dayClass = Day2()

        val validCount = dayClass.challengeOne(input)

        assertEquals(2, validCount)
    }

    @Test
    fun testChallengeOne() {
        val input = Helpers.getFileResources("day2_rui.txt").map { it.trim() }
        val validCount = Day2().challengeOne(input)

        println("$validCount passwords")
        assert(true)
    }

    @Test
    fun testChallengeTwoFunction() {
        val input = listOf("1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc")
        val dayClass = Day2()

        val validCount = dayClass.challengeTwo(input)

        assertEquals(1, validCount)
    }

    @Test
    fun testChallengeTwo() {
        val input = Helpers.getFileResources("day2_rui.txt").map { it.trim() }
        val validCount = Day2().challengeTwo(input)

        println("$validCount passwords")
        assert(true)
    }
}