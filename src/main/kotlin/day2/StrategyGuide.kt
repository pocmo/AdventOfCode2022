package day2

data class StrategyGuide(
    val strategies: List<Strategy>
) {
    fun calculateTotalScore(
        method: StrategyMethod
    ): Int {
        return strategies.sumOf { strategy -> method.calculateScore(strategy) }
    }
}
