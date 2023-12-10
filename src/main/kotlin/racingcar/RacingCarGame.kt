package racingcar

import racingcar.controller.CarController
import racingcar.controller.GameController

class RacingCarGame {
    private val carController = CarController()
    private val gameController = GameController()

    fun run() {
        setUpGameEnvironment()
    }

    private fun setUpGameEnvironment() {
        carController.setCars()
        gameController.setTryCount()
    }
}