package racingcar

import racingcar.controller.CarController
import racingcar.controller.GameController

class RacingCarGame {
    private val carController = CarController()
    private val gameController = GameController()

    fun run() {
        setUpGameEnvironment()
        playGame()
    }

    private fun setUpGameEnvironment() {
        carController.setCars()
        gameController.setTryCount()
    }

    private fun playGame() {
        carController.moveCars()
    }
}