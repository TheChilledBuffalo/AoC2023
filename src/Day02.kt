fun main() {
    fun part1(input: List<String>): Int {
        val abc = input.map {
            it
                .split(": ")[1]
                .split("; ")
                .map { i -> i
                    .split(", ")
                    .map { j -> j
                        .split(", ")
                        .map { k-> k
                            .split(" ")
                        }
                    }
                }
            }
        var sum = 0;
        var counter = 0
        abc.forEach continuing@ {it1 ->
            var counter1 = 0
            counter += 1
            it1.forEach {it2 ->
                counter1 += 1
                it2.forEach {it3 ->
                    it3.forEach {it4 ->
                        when (it4.elementAt(1)) {
                            "red" -> if (it4.elementAt(0).toInt() > 12) {
                                return@continuing
                            }
                            "green" -> if (it4.elementAt(0).toInt() > 13) {
                                return@continuing
                            }
                            "blue" -> if (it4.elementAt(0).toInt() > 14) {
                                return@continuing
                            }
                        }
                    }
                }
            }
            if (counter1 == it1.size) {
                sum += counter
            }
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        val abc = input.map {
            it
                .split(": ")[1]
                .split("; ")
                .map { i -> i
                    .split(", ")
                    .map { j -> j
                        .split(", ")
                        .map { k-> k
                            .split(" ")
                        }
                    }
                }
        }
        var sum = 0;
        abc.forEach {it1 ->
            var power = 1
            var maxRed = 0
            var maxGreen = 0
            var maxBlue = 0
            it1.forEach {it2 ->
                it2.forEach {it3 ->
                    it3.forEach {it4 ->
                        when (it4.elementAt(1)) {
                            "red" -> maxRed = maxOf(it4.elementAt(0).toInt(), maxRed)
                            "green" -> maxGreen = maxOf(it4.elementAt(0).toInt(), maxGreen)
                            "blue" -> maxBlue = maxOf(it4.elementAt(0).toInt(), maxBlue)
                        }
                    }
                }
            }
            power = maxRed * maxBlue * maxGreen
            sum += power
        }
        return sum
    }

     // test if implementation meets criteria from the description, like:
     val testInputPart1 = readInput("Day02_test")
     check(part1(testInputPart1) == 8)
     val testInputPart2 = readInput("Day02_test")
     check(part2(testInputPart2) == 2286)
 
     val input = readInput("Day02")
     part1(input).println()
     part2(input).println()
}