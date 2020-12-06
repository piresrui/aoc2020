package aoc2020

class Day6 {

    fun challengeOne(input: String): Int {
        return input
            .split("\n\n")
            .sumBy { it.replace("\n", "").toSet().size }
    }

    fun challengeTwo(input: String): Int {
        return input
            .split("\n\n")
            .sumBy { group ->
                group
                    .groupBy { it }
                    .count {
                        it.value.size == group.split("\n").size
                    }
            }
    }

}