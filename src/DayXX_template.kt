fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

     // test if implementation meets criteria from the description, like:
     val testInputPart1 = readInput("DayXX_part1_test")
     check(part1(testInputPart1) == 1)
     val testInputPart2 = readInput("DayXX_part2_test")
     check(part2(testInputPart2) == 1)
 
     val input = readInput("DayXX")
     part1(input).println()
     part2(input).println()
}