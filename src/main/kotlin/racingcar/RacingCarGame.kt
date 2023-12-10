package racingcar

import racingcar.controller.CarController
import racingcar.controller.GameController

class RacingCarGame {
    private val carController = CarController()
    private val gameController = GameController()

    fun run() {
        setUpGameEnvironment()

        while (carController.moveCount() != gameController.tryCount()) {
            playRound()
        }

        setWinner()
    }

    private fun setUpGameEnvironment() {
        carController.setCars()
        gameController.setTryCount()
    }

    private fun playRound() {
        carController.moveCars()
    }

    private fun setWinner() {
        gameController.setWinners(carController.mostMovedCars())
    }
}