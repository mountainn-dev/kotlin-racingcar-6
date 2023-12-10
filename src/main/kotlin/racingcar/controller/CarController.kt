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

    fun setCars() {
        requestCarNames()
        cars = validatedCars()
    }

    fun moveCars() {
        cars.map {
            val number = Randoms.pickNumberInRange(Constants.MIN_CAR_RANDOM_VALUE, Constants.MAX_CAR_RANDOM_VALUE)

            if (number > Constants.MIN_CAR_MOVING_VALUE) it.move()
        }
    }

    private fun requestCarNames() {
        outputView.printRequestCarNamesMessage()
    }

    private fun validatedCars(): List<Car> {
        val cars = mutableListOf<Car>()

        getNamesFromUser().map { cars.add(Car(it)) }

        return cars
    }

    private fun getNamesFromUser() = inputView.readNames()
}