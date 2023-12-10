package racingcar.controller

import racingcar.InputView
import racingcar.OutputView
import racingcar.constants.Constants

class GameController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private var tryCount = 0

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

    private fun getCountFromUser() = inputView.readTryCount()
}