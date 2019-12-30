# Object Oriented Programming

## 2019-12-08
- 인터페이스는 쉽게 말하면 껍데기라고 말할수 있고 설계도 또는 명세라고 생각하면된다.
- 모든 메소드가 추상 메소드이고, 일반 변수를 가질수 없다.
- 그 의미는 인터페이스를 구현한 클래스는 모든 메소드를 강제적으로 구현해야한다.
- 추상클래스는 0개 이상의 추상 메소드를 가지고 , 일반 메소드, 일반 변수 또한 가질수 있다.
- 그렇기에 인터페이스 역할도 하면서 구현체도 가지고 있는 돌연변이 같은 클래스이다.
- 추상 클래스 , 인터페이스 모두 인스턴스화가 될 수 없다.
- 인터페이스를 상속하기 위해선 implements 키워드를 사용, 추상 클래스를 상속하기 위해서 extends 키워드 사용
- 오버로딩은 같은 이름의 함수를 여러 개 정의하고 , 매개변수의 유형과 개수를 다르게 하여 다양한 유형의 호출에 응답하게 한다.
- 오버라이딩은 상위 클래스가 가지고 있는 멤버변수가 하위 클래스로 상속 되는것처럼 상위 클래스가 가지고 있는 메소드도 하위 클래스로 상속되어 하위 클래스에서 사용할수 있다. 하지만 하위 클래스에서 메소드를 재정의해서 사용할수있다. 
- 상속 관계에 있는 클래스 간에 같은 이름의 메소드를 정의하는 기술을 오버라이딩 이라고한다.
### 정리
- Object Oriented, 객체 : 작용의 대상이 되는 쪽, 지향 : 어떤 목표로 뜻이 쏠리어 향함
- Object Oriented, 객체 위주로 분석하고 설계하고 프로그래밍 하는것
- abstraction, 뽑아낼 추, 모양 상 -> 대상으로부터 모양을 뽑아내는 것. 즉, 대상에서 특징만을 뽑아낸 것
- agent, 1. 대리인, 중개상 2. (예술 연예 스포츠 부문의) 에이전트 3. 첩자, 첩보원

### 객체 지향 키워드
- class 클래스, object 오브젝트, 캡슐화 encapsulation, 상속성 inheritance, 다형성 polymorphism
- class 클래스 = abstract 추상, object 오브젝트 = instance 실체

### 정의 1
- 클래스 class는 표현 대상의 **특징에 대한 서술**을 말한다.
- 클래스는 표현 대상들의 공통적인 특징을 서술한 것

### 추상
- 추상은 사용자가 구체적인 내용을 생각하지 않고도 사용할 수 있도록 함
- 프로시져 추상화 procedure abstraction : 함수
- 데이터 추상화 data abstraction : 구조체, 배열 포인터

### 정의 2
- 오브젝트 object는 클래스의 인스턴스 instance이다.
- 오브젝트는 instance of class 이다.
- 클래스가 실체로 만들어진 것이 인스턴스

### 클래스 class
- 공통 특징, 서술

### 오브젝트 object
- 구체, 실제 존재, 고유성

### 개념 
- 클래스 class == 추상 abstract
- 오브젝트 object == 실체 instance

- attribute == data == member variables == state == field
- behavior == operation == member function == method
- 클래스 class == 개념 concept == 타입 type
- 객체 object == 실체 instance == 변수 variable

### 특징 
- 캡슐화 encapsulation, 상속성 inheritance, 다형성 polymorphism 세 가지를 지원하면 객체 지향 프로그래밍 언어라 한다.

### 관계 
- 상속은 IS-A 관계, Poodle IS-A Dog

## 2019-11-29
- initt
- hjh commit
