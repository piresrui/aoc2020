package aoc2020

class Day7 {
    /**
     * bag1 -> (1,bag2)
     * bag2 -> (2, bag1), (1, bag4)
     *
     * Visited -> been here
     * toVisit -> need to visit in the future
     *
     * toVisit -> add Head
     * while toVisit not empty:
     *  // mark visited
     *  // add children to toVisit if not visited
     */
    fun challengeOne(input: List<String>): Int {

        val bagMap = createBagMap(input)

        val visited = mutableSetOf<String>()
        val bagQueue = ArrayDeque<String>()
        bagQueue.add("shiny gold")

        while (!bagQueue.isEmpty()) {
            val currBag = bagQueue.removeFirst()
            bagMap
                .filterValues { bags -> bags.any { it.second == currBag } }
                .keys
                .forEach { bag -> if(visited.add(bag)) {bagQueue.addLast(bag)} }
        }

        return visited.size
    }

    fun challengeTwo(input: List<String>): Int {
        val bagMap = createBagMap(input)
        return bagInBag("shiny gold", bagMap)
    }

    /**
     *
     * bag1 -> (1, bag2), (2, bag3)
     * bag2 -> 0
     * bag3 -> 0
     *
     * total = 0
     * for (num, nextBag) in bag3:
     *   total += num + nextBag
     */
    fun bagInBag(bag: String, bagMap: Map<String, List<Pair<Int, String>>>): Int {
       return bagMap[bag]
           ?.map { (num, nextBag) ->
                num + num * bagInBag(nextBag, bagMap)
            }?.reduce { acc, i -> acc + i  } ?: 0

    }


    /**
     *  bag1 contains 2 bag3, 3 bag4
     *  Bag1 -> [ (2, bag3), (3, bag4) ]
     */
    fun createBagMap(input: List<String>): Map<String, List<Pair<Int, String>>> {
        return input
            .filter { !it.contains("no other") }
            .map {
                val (key, content) = it.split(" bags contain ")
                key to Regex("(\\d+) ([a-z\\s]+) bag[s]*").findAll(content)
                    .map { match ->
                        val (num, bag) = match.destructured
                        num.toInt() to bag
                    }.toList()
            }.toMap()
    }
}
