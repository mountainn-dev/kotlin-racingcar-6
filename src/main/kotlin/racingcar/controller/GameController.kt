package racingcar.controller

import racingcar.InputView
import racingcar.OutputView
import racingcar.constants.Constants
import racingcar.domain.Car

class GameController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private var tryCount = 0
    private lateinit var winners: List<Car>

    fun tryCount() = tryCount

    fun setTryCount() {
        requestTryCount()
        tryCount = validatedTryCount()
    }

    private fun requestTryCount() {
        outputView.printRequestTryCountMessage()
    }

    private fun validatedTryCount(): Int {
        val tryCount = getCountFromUser()

        require(tryCount >= Constants.MIN_TRY_COUNT_VALUE)

        return tryCount
    }

    fun setWinners(mostMovedCars: List<Car>) {
        winners = mostMovedCars
        showWinner()
    }

    private fun showWinner() {
        outputView.printResultGame(winners)
    }

    private fun getCountFromUser() = inputView.readTryCount()
}