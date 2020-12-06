package aoc2020

class Day5 {

    /**
     * Each input string is a 10 char string. First 7 -> [FB]{7} Last 3 -> [RL]{3}
     *
     * 2⁷ -> 128
     * 2³ -> 8
     *
     *  1111111 -> 127
     *  B -> 1 F -> 0
     *  R -> 1 L -> 0
     *
     */
    fun challengeOne(input: List<String>): Int {
        return parseToInt(input).maxOrNull()!!

    }

    /**
     * 12
     * 23
     * 35
     *
     * Sort and zip with the next number. If a number is missing then the pair
     * will not be sequential. Non sequential find is the missing number
     */
    fun challengeTwo(input: List<String>): Int {
        return parseToInt(input)
            .sorted()
            .zipWithNext()
            .first { (left, right) -> left + 1 != right }
            .let { (left, _) -> left + 1 }
    }

    private fun parseToInt(input: List<String>): List<Int> {
        return input.map(this::toBinary)
    }

    private fun toBinary(input: String): Int {
        return input
            .replace(Regex("[BR]"), "1")
            .replace(Regex("[FL]"), "0")
            .toInt(2)
    }

}