# LOG
- 2020-01-01 객체 지향적 개발이 부족한듯 추가 개발 필요 
- 2020-01-02 Player 수정 

# DEV PROCESS
- 게임판 생성, 참여자 설정
- 플레이어 생성
- 플레이어의 가위 바위 보 선택까지 개발
- 게임 진행은 미개발

# DESIGN
### PLAYER
- PLAYER는 가위 바위 보 중 하나를 선택해서 낸다.

### PLAY GROUND
- PLAY GROUND는 참여한 유저들을 대상으로 가위 바위 보 게임을 진행한다.
- PLAY GROUND는 여러 게임을 위한 게임 실행 장소 이다.
- PLAY GROUND는 Game, Rule, Winner, Loser 등등을 이용해 게임을 진행한다.
- Game, Rule, Winner, Loser 등을 상속받은 RockPaperScissorsGame이 Play Ground에서 구현된다. 

# 가위 바위 보 게임
1. 현실 세계의 가위 바위 보 게임을 코드로 구현한다.
2. interface, abstract 등 추상화 계층을 활용한다.
3. 1:1 가위바위보 먼저 선행 구현한다.
4. 추상화 및 구현체의 구조나 변수명, 함수명, 클래스 이름 등등 자의적으로 구현한다.