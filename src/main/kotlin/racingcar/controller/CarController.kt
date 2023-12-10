package racingcar.controller

import racingcar.InputView
import racingcar.OutputView
import racingcar.domain.Car
import camp.nextstep.edu.missionutils.Randoms
import racingcar.constants.Constants

class CarController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private lateinit var cars: List<Car>
    private var moveCount = 0

    fun moveCount() = moveCount

    fun setCars() {
        requestCarNames()
        cars = validatedCars()
    }

    private fun requestCarNames() {
        outputView.printRequestCarNamesMessage()
    }

    private fun validatedCars(): List<Car> {
        val cars = mutableListOf<Car>()

        getNamesFromUser().map { cars.add(Car(it)) }

        return cars
    }

    fun moveCars() {
        moveCarsWhenRandomValueOverMovingValue()
        showResult()
        moveCount++
    }

    private fun moveCarsWhenRandomValueOverMovingValue() {
        cars.map {
            if (generatedRandomMovingValue() >= Constants.MIN_CAR_MOVING_VALUE) it.move()
        }
    }

    private fun showResult() {
        outputView.printResultMoving(cars)
        outputView.printBlankLine()
    }

    fun mostMovedCars(): List<Car> {
        val mostMovedCars = mutableListOf<Car>()
        val maxPosition = cars.maxOf { it.position() }

        cars.map { if (it.position() == maxPosition) mostMovedCars.add(it) }

        return mostMovedCars
    }

    private fun getNamesFromUser() = inputView.readNames()
    private fun generatedRandomMovingValue() = Randoms.pickNumberInRange(
        Constants.MIN_CAR_RANDOM_VALUE, Constants.MAX_CAR_RANDOM_VALUE
    )
}