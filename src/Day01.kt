fun main() {
    fun part1(input: List<String>): Int {
        return input
                .map { j -> j.filter { i -> i.isDigit() } }
                .sumOf { "${it.first()}${it.last()}".toInt() }
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInputPart1 = readInput("Day01_part1_test")
    check(part1(testInputPart1) == 142)
    val testInputPart2 = readInput("Day01_part2_test")
    check(part2(testInputPart2) == 281)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
