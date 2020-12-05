package aoc2020

class Day4 {

    private val regex = Regex("([a-z]{3}):([a-z0-9#]*)[\\s|\b]?")
    private val hclRegex = Regex("#[a-f0-9]{6}")
    private val pidRegex = Regex("\\d{9}")
    private val eclValues = setOf("amb", "blu", "brn", "gry", "grn", "hzl", "oth")

    fun challengeOne(input: String, required: List<String>): Int {
        return input
            .split("\n\n")
            .count { passport -> required.all(passport::contains) }
    }

    fun challengeTwo(input: String, required: List<String>): Int {
        return input
            .split("\n\n")
            .count { passport ->
                required.all(passport::contains) && validate(passport.replace("\n", " "))
            }
    }

    private fun validate(passport: String): Boolean {

        return regex.findAll(passport).all {
            val (key, value) = it.destructured

            when (key) {
                "byr" -> value.toInt() in 1920..2002
                "iyr" -> value.toInt() in 2010..2020
                "eyr" -> value.toInt() in 2020..2030
                "hgt" ->
                    when {
                        value.contains("cm") -> {
                            value.split("c")[0].toInt() in 150..193
                        }
                        value.contains("in") -> {
                            value.split("i")[0].toInt() in 59..76
                        }
                        else -> {
                            false
                        }
                    }
                "hcl" -> hclRegex.matches(value)
                "ecl" -> eclValues.contains(value)
                "pid" -> pidRegex.matches(value)
                else -> true // should not happen
            }
        }

    }

}