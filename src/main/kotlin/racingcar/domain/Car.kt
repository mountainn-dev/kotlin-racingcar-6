package racingcar.domain

import racingcar.constants.Constants

class Car(private val name: String) {
    private var position = 0

    init {
        require(name.length in Constants.MIN_CAR_NAME_LENGTH..Constants.MAX_CAR_NAME_LENGTH)
    }

    fun name() = name

    fun position() = position

    fun move() {
        position++
    }
}