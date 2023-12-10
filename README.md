# 미션 - 자동차 경주
일정 확률로 자동차를 전진시키며 우승자를 가려내는 자동차 경주 게임입니다.

## 기능 목록
- [x] 자동차 이름을 정한다. - CarController#setCars()
  - [x] 값이 올바르지 않은 형태인 경우 예외가 발생하고 프로그램이 종료된다. - InputValidator, Car
- [x] 총 시도 횟수를 정한다. - GameController#setTryCount()
  - [x] 값이 올바르지 않은 형태인 경우 예외가 발생하고 프로그램이 종료된다. - InputValidator, GameController#validatedTryCount()
- [ ] 경주를 진행한다.
- [ ] 우승자를 선정한다.

## 기능 요구 사항
- 자동차 이름을 입력할 때는 쉼표(,) 를 기준으로 구분하며, 최대 5 자까지 입력이 가능하다.
- 자동차는 0 부터 9 까지의 난수를 생성하여 4 이상의 수가 나온 경우 전진한다.
- 총 시도 횟수만큼 게임이 진행되고 우승자를 가려낸 후 게임은 종료된다.
- 우승자는 한 명 이상일 수 있으며, 우승자가 여러명인 경우 쉼표(,) 를 기준으로 구분하여 출력한다.

## 예외 상황
사용자가 잘못된 값을 입력한 경우 IllegalArgumentExcetpion 을 발생시키고 프로그램이 종료된다.

- 공통
  - 입력값이 공백인 경우
  - 입력값에 공백이 포함된 경우
  - 여러 값을 입력하는 경우 구분자로 구분되어있지 않은 경우
- 자동차 이름
  - 이름의 길이가 1 ~ 5 자를 벗어난 경우
- 총 시도 횟수
  - 문자를 입력한 경우
  - 1 보다 작은 값을 입력한 경우