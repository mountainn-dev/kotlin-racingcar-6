package racingcar

import racingcar.constants.Request
import racingcar.constants.Result
import racingcar.domain.Car

class OutputView {

    fun printRequestCarNamesMessage() {
        println(Request.REQUEST_CAR_NAMES_MESSAGE)
    }

    fun printRequestTryCountMessage() {
        println(Request.REQUEST_TRY_COUNT_MESSAGE)
    }

    fun printResultMoving(cars: List<Car>) {
        cars.map {
            println(String.format(Result.RESULT_CAR_MOVING, it.name(), Result.CAR_MOVING_TRACE.repeat(it.position())))
        }
    }

    fun printBlankLine() {
        println()
    }

    fun printResultGame(winners: List<Car>) {
        if (winners.size == ONE) printWhenSingleWinner(winners)
        else printWhenMultipleWinner(winners)
    }

    private fun printWhenSingleWinner(winners: List<Car>) {
        winners.map { println(String.format(Result.RESULT_GAME, it.name())) }
    }

    private fun printWhenMultipleWinner(winners: List<Car>) {
        var winnerNames = ""

        winners.map {
            if (it != winners.last()) winnerNames += it.name() + WINNERS_DIVIDER
            else winnerNames += it.name()
        }

        println(String.format(Result.RESULT_GAME, winnerNames))
    }

    companion object {
        private const val ONE = 1
        private const val WINNERS_DIVIDER = ", "
    }
}