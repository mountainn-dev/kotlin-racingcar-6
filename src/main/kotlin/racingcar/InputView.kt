package racingcar

import camp.nextstep.edu.missionutils.Console
import racingcar.constants.Constants

class InputView {
    private val inputValidator = InputValidator()

    fun readNames() = getValidatedNames(read())

    fun readTryCount() = getValidatedTryCount(read())

    private fun getValidatedNames(input: String): List<String> {
        inputValidator.isNotBlank(input)
        inputValidator.hasNotBlank(input)
        inputValidator.hasCommaSeparator(input)

        return input.split(Constants.COMMA)
    }

    private fun getValidatedTryCount(input: String): Int {
        inputValidator.isNotBlank(input)
        inputValidator.isDigit(input)

        return Integer.parseInt(input)
    }

    private fun read() = Console.readLine()
}