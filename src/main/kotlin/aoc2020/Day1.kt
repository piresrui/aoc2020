package aoc2020


/**
 *  List of numbers
 *  Sum to X
 *
 *  Find pair which sums to a given value
 *
 *  [1 3 5 4 7] -> 10
 *
 *  Set -> [1, 3, 5, 4] : O(1)
 *
 */
class ChallengeOne {

    fun run(input: List<Int>, sum: Int): Pair<Int, Int> {
        val found = mutableSetOf<Int>()

        for (i in input) {
            val complement = sum - i
            if (found.contains(complement)) {
                return Pair(complement, i)
            }
            found.add(i)
        }
        return Pair(0, 0)
    }

}


/**
 *
 *  List of numbers
 *  Sum to X
 *
 *  Find triple which sums to a given value
 *
 * i in [5, 4, 1, 2] -> 11
 *  set = []
 *  complement = sum - i
 *  j in [4, 1, 2]
 *      if (complement - arr[j]) in set
 *          FOUND ALL
 *      set.add(arr[j])
 *
 */
class ChallengeTwo {

    fun run(input: List<Int>, sum: Int): Int {

        for(i in input.indices) {
            val found = mutableSetOf<Int>()

            val complement = sum - input[i]
            for(j in i+1 until input.size) {
                if (found.contains(complement - input[j])) {
                    println("Triple is: ${input[i]}, ${input[j]}, ${complement - input[j]}")
                    return input[i] * input[j] * (complement - input[j])
                }
                found.add(input[j])

            }
        }
        return 0
    }
}