# Java란?
- 1991년 Oak라는 이름으로 개발된 프로그래밍 언어.
- 썬마이크로시스템즈에서 제임스 고슬링(James Gosling)외 여러 개발자에 의해 만들어짐
- 1996년 Java 1 로 정식 버전을 발표
- 2009년부터는 오라클(Oracle) 사에서 관리하고 있으며, 버전 20까지 출시됨
-OracleJDK*(유료 구독형 라이선스) / OpenJDK(GPL 라이선스)로 나뉘어짐

#### JRE / JDK / JVM
- JRE(Java Runtime Environment) : Java로 개발된 클래스를 실행 및 운영할 수 있는 환경.
- JDK(Java Development Kit) : 개발에 필요한 환경을 제공하며, 컴파일러와 실행 도구 등이 포함되어 있어 JDK 없이는 프로그래밍이 불가함.
-JVM(Java Virtual Machine) : 컴파일된 class 파일을 각각의 운영체제(OS)의 특성에서 동작할 수 있도록 해석하여 전달하는 역할을 수행. 
    - 사람이 작성하는 프로그래밍 코드(소스코드)의 확장자는 .java인데, 컴파일러를 통해 소스코드를 컴퓨터가 이해할 수 있는 코드인 기계어로 번역함. 이것을 컴파일과정이라고 하며 컴파일된 파일의 확장자는 .class임. 


## 자바의 특징
- OS(운영체제)로부터 독립적 > JRE라는 자바 실행환경이 설치된 모든 운영체제에서 똑같은 실행 결과를 얻을 수 있음
- 객체지향(OOP; Object Oriented Programming)  프로그래밍 
- JDK 1.8부터는 함수형 프로그래밍(Functional Programming)을 지원함
- 메모리 관리(Garbage Collector)를 자동으로 해주기 때문에 따로 처리할 필요X