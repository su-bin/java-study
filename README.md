# java-study
_이것이 자바다 개인 학습_

## 목차
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

## CHAPTER-02-변수와-타입

### 변수란
- 하나의 값을 저장할 수 있는 메모리 공간이다.

### 변수의 선언
~~~java
int age;
double value;
~~~
~~~java
int x, y, z;
~~~
|작성규칙|
|:--------|
|첫 번째 글자는 문자이거나 '$','_' 이어야 하고 숫자로 시작할 수 없다. (필수)|
|영어 대소문자가 구분된다. (필수)|
|첫 문자는 영어 소문자로 시작하되, 다른 단어가 붙을 경우 첫 문자를 대문자로 한다. (관례)|
|문자 수(길이)의 제한은 없다.|
|자바 예약어는 사용할 수 없다.(필수)|

|분류|예약어|
|:----:|------|
|기본 데이터 타입|boolean, byte, char, short, int, long, float, double|
|접근 지정자|private, protected, public|
|클래스와 관련된 것|class, abstract, interface, extends, implement, enum|
|객체와 관련된 것|new, instanceof, this, super, null|
|메소드와 관련된 것|void, return|
|제어문과 관련된 것|if, else, switch, case, default, for, do, while, break, continue|
|논리값|true, false|
|예외 처리와 관련된 것|try, carch, finally, throw, throws|
|기타|transient, volatile, package, import, synchronized, native, final,, static, strictfp, assert|

### 변수의 사용

#### 변수값 저장
~~~java
int score;  // 변수 선언
score = 90; // 값 저장 
~~~
~~~java
int score = 90;     // 선언과 동시에 값 저장
~~~
- 소스 코드 내에서 직접 입력된 값을 리터럴(literal)이라고 부른다

#### 정수 리터럴
- 10진수
> 0, 75, -100
- 8진수
> 02, -04
- 16 진수
> 0x5, 0xA, 0xB3, 0xAC08
- 정수 리터럴을 저장할 수 있는 타입은 byte, char, short, int, long과 같이 5개가 있다.

#### 실수 리터럴
- 10진수 실수
> 0.25, -3.14
- 10진수 지수와 가수
> 5E7       // 5 x 10^7  
> 0.12E-5   // 0.12 x 10^-5
- 실수 리터럴을 저장할 수 있는 타입은 float, double이 있다.

#### 문자 리터럴
> 'A', '힌', '\t', '\n'

|이스케이프 문자|용도|유니코드|
|:---:|---|---|
|'\t'|수평 탭|0x0009|
|'\n'|줄 바꿈|0x000a|
|'\r'|리턴|0x000d|
|'\"'|" (큰따옴표)|0x0022|
|'\''|' (작은따옴표)|0x0027|
|'\\'|\|0x005c|
|'\u16진수'|16진수에 해당하는 유니코드|0x0000 ~ 0xffff|

#### 문자열 리터럴
> "대한민국"  
> "탭 만큼 이동 \t 합니다."  
> "한줄 내려 쓰기 \n 합니다."

#### 논리 리터럴
> true, false

### 변수의 사용 범위
- 변수는 선언된 블록 내에서만 사용이 가능하다.
~~~java
public class VariableScopeExample {
    public static void main(String[] args){
      int v1 = 15;
      
      if(v1 > 10) {
          int v2 = v1 - 10;
      }
      int v3 = v1 + v2 + 5;     // v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
    }
}
~~~

### 데이터 타입

#### 기본(원시: primitive) 타입
- 정수, 실수, 문자, 논리 리터럴을 직접 저장하는 타입을 말한다.

|값의 종류|기본 타입|메모리 사용 크기||
|---|---|---|---|
|정수|byte|1 byte|8 bit|
| |char|2 byte |16 bit|
| |short|2 byte|16 bit|
| |int|4 byte|32 bit|
| |long|8 byte|64 bit|
|실수|float|4 byte|32 bit|
| |double|8 byte|64 bit|
|논리|boolean|1 byte|8 bit|


### 타입 변환
- 데이터 타입을 다른 데이터 타입으로 변환하는 것을 말한다.
- 자동(묵시작) 타입 변환과 강제(명시적) 타입 변환이 있다.

#### 자동 타입 변환
- Promotion
- 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될 때 발생한다.
> byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)

~~~java
byte byteValue = 10;
int intValue = byteValue;       // 자동 타입 변환이 일어난다

int intValue2 = 200;
double soubleValue = intValue2;     // 200.0

char charValue = 'A';
int intValue3 = charValue;      // 65가 저장

byte byteData = 65;
char charData = byteData;       // 컴파일 에러
char charData2 = (char) byteData;        // 강제 타입 변환
~~~

#### 강제 타입 변환 
- 캐스팅(Casting)
- 강제적으로 큰 데이터 타입을 작은 데이터 타입으로 쪼개어서 저장한다
> 작은 크기 타입 = (작은 크기 타입)큰 크기 타입
~~~java
int intValue = 103029770;
byte byteValue = (byte) intValue;       // 강제 타입 변환(캐스팅)
~~~
~~~java
long longValue = 300;
int intValue = (int) longValue;     // intValue는 300이 그대로 저장된다,
~~~
~~~java
intt intValue = 'A';
chat charValue = (char) intValue;
Syetem.out.println(charValue);
~~~
~~~java
double doubleValue = 3.14;
int intValue = (int) double;        // intValue는 정수 부분인 3만 저장된다.
~~~

|기본 타입|최대값 상수|최소값 상수|
|---|---|---|
|byte|Byte.MAX_VALUE|Byte.MIN_VALUE|

#### 연산식에서의 자동 타입 변환
- 서로 다른 타입의 피연산자가 있을 경우 두 피연산자 중 크기가 큰 타입으로 자동 변환된 후 연산을 수행한다.