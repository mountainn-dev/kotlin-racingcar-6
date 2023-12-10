package racingcar.controller

import racingcar.InputView
import racingcar.OutputView
import racingcar.domain.Car

class CarController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private lateinit var cars: List<Car>

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

    private fun getNamesFromUser() = inputView.readNames()
}