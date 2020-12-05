package test.kotlin

import aoc2020.Day4
import helpers.Helpers
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day4Test {

    @Test
    fun testChallengeOneFunction() {
        val required = listOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")
        val input = Helpers.getFileResourceAsString("day4_test.txt")

        val dayClass = Day4()

        val valid = dayClass.challengeOne(input, required)

        assertEquals(2, valid)
    }

    @Test
    fun testChallengeOne() {
        val required = listOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")
        val input = Helpers.getFileResourceAsString("day4_rui.txt")

        val dayClass = Day4()

        val valid = dayClass.challengeOne(input, required)

        println("$valid valid passports")
        assert(true)
    }

    @Test
    fun testChallengeTwoFunction() {
        val required = listOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")
        val input_invalid = Helpers.getFileResourceAsString("day4_invalid.txt")
        val input_valid = Helpers.getFileResourceAsString("day4_valid.txt")

        val dayClass = Day4()

        val valid = dayClass.challengeTwo(input_valid, required)
        val invalid = dayClass.challengeTwo(input_invalid, required)

        assertEquals(4, valid)
        assertEquals(0, invalid)
    }

    @Test
    fun testChallengeTwo() {
        val required = listOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")
        val input = Helpers.getFileResourceAsString("day4_rui.txt")

        val dayClass = Day4()

        val valid = dayClass.challengeTwo(input, required)

        println("$valid valid passports")
        assert(true)
    }
}