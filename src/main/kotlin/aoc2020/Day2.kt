package aoc2020

class Day2 {

    private val regex = Regex("(\\d+)-(\\d+)\\s([a-z]):\\s([a-z]+)")

    fun challengeOne(input: List<String>): Int {
        return input.filter(this::checkContainsCorrectOccurences).count()
    }
    
    fun challengeTwo(input: List<String>): Int {
        return input.filter(this::checkContainsCorrectPositions).count() 
    }

    private fun checkContainsCorrectOccurences(passwordString: String): Boolean {
        val (lower, upper, charToFind, stringToSearch) = destructure(passwordString)
        return containsCorrectOccurences(
                charToFind,
                stringToSearch,
                lower.toInt(),
                upper.toInt()
        )
    }

    private fun checkContainsCorrectPositions(passwordString: String): Boolean {
        val (position1, position2, charToFind, stringToSearch) = destructure(passwordString)
        return containsCharInEitherPos(
                charToFind,
                stringToSearch,
                position1.toInt(),
                position2.toInt()
        )
    }

    private fun destructure(input: String): MatchResult.Destructured {
        return regex.find(input)!!.destructured
    }

    private fun containsCorrectOccurences(charToFind: String, stringToSearch: String, lowerBound: Int, upperBound: Int): Boolean {
        return stringToSearch.count { it == charToFind.single() } in lowerBound..upperBound
    }

    private fun containsCharInEitherPos(charToFind: String, stringToSearch: String, pos1: Int, pos2: Int): Boolean {
        return (stringToSearch[pos1 - 1] == charToFind.single()) xor (stringToSearch[pos2 - 1] == charToFind.single())
    }
}