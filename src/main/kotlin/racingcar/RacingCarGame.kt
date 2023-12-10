package racingcar

import racingcar.controller.CarController

class RacingCarGame {
    private val carController = CarController()

    fun run() {
        setUpGameEnvironment()
    }

    private fun setUpGameEnvironment() {
        carController.setCars()
    }
}