package racingcar

import camp.nextstep.edu.missionutils.Console
import racingcar.constants.Constants

class InputView {
    private val inputValidator = InputValidator()

    fun readNames() = getValidatedNames(read())

    private fun getValidatedNames(input: String): List<String> {
        inputValidator.isNotBlank(input)
        inputValidator.hasNotBlank(input)
        inputValidator.hasCommaSeparator(input)

        return input.split(Constants.COMMA)
    }

    private fun read() = Console.readLine()
}