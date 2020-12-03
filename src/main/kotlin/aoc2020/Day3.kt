package aoc2020

class Day3 {

    fun challengeOne(input: List<String>, slope: Pair<Int, Int>): Int {
        return input
            .mapIndexed{ idx, it -> walkSlope(idx, it, slope.first, slope.second) }
            .reduce { acc, i -> acc + i }
    }


    fun challengeTwo(input: List<String>, slopes: List<Pair<Int, Int>>): Int {
        return slopes
            .map { challengeOne(input, it) }
            .reduce{ acc, i -> acc * i }

    }

    private fun walkSlope(index: Int, line: String, right: Int, down: Int): Int {

        /**
         * Line index * Steps to the right to get correct position per step
         * Divided by down to so right value doesnt get added on skipped lines
         * Modulo by line length to simulate repeating pattern
         *
         * Index modulo steps down to skip lines based on down step
         */
        val condition = line[ (index * right / down) % line.length ] == '#'
                && index % down == 0

        return if( condition )
            1
        else
            0

    }

}