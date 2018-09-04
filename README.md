# java-study
_이것이 자바다 개인 학습_

##목차
- [CHAPTER-01-자바-시작하기](#CHAPTER-01-자바-시작하기)
- [CHAPTER-02-변수와-타입](#CHAPTER-02-변수와-타입)

## CHAPTER-01-자바-시작하기

### 자바의 특징

- 이식성이 높은 언어이다.
- 객체 지향 언어이다.
- 함수적 스타일 코딩을 지원한다.
- 메모리를 자동으로 관리한다.
- 다양한 애플리케이션을 개발할 수 있다.

> Java SE (Standard Edition) - 기본 에디션  
> Java EE (Enterprise Edition) - 서버용 애플리케이션 개발 에디션

- 멀티 스레드(Multi-Thread)를 쉽게 구현할 수 있다.
- 동적 로딩(Dynamic Loading)을 지원한다.
- 오픈소스 라이브러리가 풍부하다.
 
### 자바 가상 기계(JVM)
- 운영체제를 대신해서 자바 프로그램을 실행하는 가상의 운영체제 역할을 한다.
- 운영체제에 종속적이다.
> Write once, run anywhere.

### 자바 프로그램 개발 순서
1. .java 소스 파일 작성
2. 컴파일러(javac.exe)로 바이트 코드 파일(.class) 생성
3. JVM 구동 명령어(java.exe)로 실행

### 프로그램 소스 분석
~~~java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to the java world!");
    }
}
~~~
- 클래스 : 필드 또는 메소드를 포함하는 블록
- 메소드 : 어떤 일을 처리하는 실행문들을 모아 놓은 블록
> main() 메소드 : 실행 진입점(entry point)

### 주석 사용하기

| 주석 기호 | 설명 |
| :---------: | :---------|
| // | //부터 라인 끝까지 주석으로 처리한다. (행 주석) |
| /* ~ */ | /*와 */사이에 있는 모든 범위를 주석으로 처리한다. (범위 주석) |

### 실행문
- 변수 선언, 값 저장, 메소드 호출에 해당하는 코드.
- 실행문의 마지막에 반드시 세미콜론(;)을 붙여서 실행문이 끝났음을 표시해주어야 한다.

---
## CHAPTER-02-변수와-타입 [목차](#index)


