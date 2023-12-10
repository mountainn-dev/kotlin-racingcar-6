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
        cars = getCarsFromUser()
    }

    private fun requestCarNames() {
        outputView.printRequestCarNamesMessage()
    }

    private fun getCarsFromUser(): List<Car> {
        val cars = mutableListOf<Car>()

        getCarNamesFromUser().map { cars.add(Car(it)) }

        return cars
    }

    private fun getCarNamesFromUser() = inputView.readNames()
}