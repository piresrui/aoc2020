package test.kotlin

import aoc2020.Day3
import helpers.Helpers
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day3Test {

    @Test
    fun testChallengeOneFunction() {
        val input = Helpers.getFileResources("day3_test.txt")
        val dayClass = Day3()

        val validCount = dayClass.challengeOne(input, Pair(3, 1))

        Assertions.assertEquals(7, validCount)
    }

    @Test
    fun testChallengeOne() {
        val input = Helpers.getFileResources("day3_rui.txt")
        val dayClass = Day3()

        val validCount = dayClass.challengeOne(input, Pair(3, 1))
        println("$validCount trees")
        assert(true)
    }

    @Test
    fun testChallengeTwoFunction() {
        val slopes = listOf(Pair(1,1),Pair(3,1), Pair(5,1), Pair(7,1), Pair(1,2))
        val input = Helpers.getFileResources("day3_test.txt")
        val dayClass = Day3()

        val answer = dayClass.challengeTwo(input, slopes)

        Assertions.assertEquals(336, answer)
    }

    @Test
    fun testChallengeTwo() {
        val slopes = listOf(Pair(1,1),Pair(3,1), Pair(5,1), Pair(7,1), Pair(1,2))
        val input = Helpers.getFileResources("day3_rui.txt")
        val dayClass = Day3()

        val answer = dayClass.challengeTwo(input, slopes)
        println("$answer trees")

        assert(true)
    }
}