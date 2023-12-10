package racingcar

import racingcar.constants.Constants

class InputValidator {

    fun isNotBlank(input: String) {
        require(input.isNotBlank())
    }

    fun hasNotBlank(input: String) {
        require(!input.contains(BLANK))
    }

    fun hasCommaSeparator(input: String) {
        require(input.contains(Constants.COMMA))
    }

    companion object {
        private const val BLANK = " "
    }
}