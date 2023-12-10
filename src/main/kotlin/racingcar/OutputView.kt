package racingcar

import racingcar.constants.Request
import racingcar.constants.Result
import racingcar.domain.Car

class OutputView {

    fun printRequestCarNamesMessage() {
        println(Request.REQUEST_CAR_NAMES_MESSAGE)
    }

    fun printRequestTryCountMessage() {
        println(Request.REQUEST_TRY_COUNT_MESSAGE)
    }

    fun printResultMoving(cars: List<Car>) {
        cars.map {
            println(String.format(Result.RESULT_CAR_MOVING, it.name(), Result.CAR_MOVING_TRACE.repeat(it.position())))
        }
    }
}