package test.kotlin

import aoc2020.Day6
import helpers.Helpers
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day6Test {

    @Test
    fun testChallengeOneFunction() {

        val input = Helpers.getFileResourceAsString("day6_test.txt")

        val sum = Day6().challengeOne(input)
        Assertions.assertEquals(11, sum)

    }

    @Test
    fun testChallengeOne() {

        val input = Helpers.getFileResourceAsString("day6_rui.txt")

        val sum = Day6().challengeOne(input)
        println(sum)

        assert(true)
    }

    @Test
    fun testChallengeTwoFunction() {

        val input = Helpers.getFileResourceAsString("day6_test.txt")

        val sum = Day6().challengeTwo(input)
        Assertions.assertEquals(6, sum)

    }

    @Test
    fun testChallengeTwo() {

        val input = Helpers.getFileResourceAsString("day6_rui.txt")

        val sum = Day6().challengeTwo(input)
        println(sum)

        assert(true)
    }

}