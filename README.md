![image](https://user-images.githubusercontent.com/81465068/219571225-27face3f-67dd-4264-85a6-de09b521e7f5.png)

# 우테코 5기 1레벨 1주차 - 자동차 경주 미션

![Generic badge](https://img.shields.io/badge/level1-week1-green.svg)
![Generic badge](https://img.shields.io/badge/test-24_passed-blue.svg)
![Generic badge](https://img.shields.io/badge/version-1.0.1-brightgreen.svg)

> 우아한테크코스 5기 1레벨 1주차 미션, 자동차 경주 미션을 구현한 저장소입니다.

![image](https://user-images.githubusercontent.com/81465068/219575152-b2d98760-5db7-4e02-9e0a-62e6b0ac98ac.png)

# 목차
- [시작하기](#시작하기)
- [기능 목록](#기능-목록)
  - [입력 기능](#입력-기능)
  - [이동 기능](#이동-기능)
  - [출력 기능](#출력-기능)


## 시작하기
해당 레포지토리를 Clone하고 IDE에서 src/main/java에 위치한 Application.java 파일을 실행시켜 프로그램을 동작시킬 수 있습니다.
```
git clone -b as https://github.com/amaran-th/java-racingcar.git
```

## 기능 목록
### 입력 기능
- 경주할 자동차 이름을 입력받는다
    - **[예외처리]** 자동차의 이름은 1 이상 5 이하여아 한다
- 몇 번 이동할 지 입력받는다
    - **[예외처리]** 숫자만 입력 받아야 한다
### 이동 기능
- 0에서 9사이 랜덤 값을 구한다
    - 값이 4이상일 경우 전진한다
    - 값이 3이하이면 멈춘다
### 출력 기능
- 자동차 이름과 자동차의 현재 위치를 출력한다.
- 최종 우승자를 출력한다.
    - 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
- 에러 메세지 출력
