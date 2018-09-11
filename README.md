# java-study
_이것이 자바다 개인 학습_

## 목차
- [CHAPTER-01-자바-시작하기](/chapter01/chapter01.md)
- [CHAPTER-02-변수와-타입](/chapter02/chapter02.md)
- [CHAPTER-03-연산자](/chapter03/chapter03.md)
- [CHAPTER-04-조건문과-반복문](/chapter04/chapter04.md)
- [CHAPTER-05-참조-타입](/chapter05/chapter05.md)
- [CHAPTER-06-클래스](/chapter06/chapter06.md)

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

## CHAPTER-03-연산자

### 연산자와 연산식
- 연산(operations) : 프로그램에서 데이터를 처리하여 결과를 산출
- 연산자(operator) : 연산에 사용되는 표시나 기호
- 피연산자(operand) : 연산되는 데이터
- 연산식(expressions) : 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것

|연산자 동류|연산자|피연산자 수|산출값|기능 설명|
|---|---|---|---|---|
|산술|+, -, *, /, %|이항|숫자|사칙연산 및 나머지 계산|
|부호|+, -|단항|숫자|음수와 양수의 부호
|문자열|+|이항|문자열|두 문자열을 연결|
|대입|=, +=, -=. *=, /=, %=, &=, ^=, &#124;=, <<=, >>=, >>>=|이항|다양 |우변의 값을 좌변의 변수에 대입|
|증감|++, --|단항|숫자|1만큼 증가/감소|
|비교|==, !=, >, <, >=, <=, instanceof|이항|boolean|값의 비교|
|논리|!, &, &#124;, &&, &#124;&#124;|단항, 이항|boolean|논리적 NOT, AND, OR 연산|
|조건|(조건식) ? A : B|삼항|다양|조건에 따라 A 또는 B 중 하나를 선택|
|비트| ~, &, &#124;, ^|단항, 이항|숫자, boolean|비트 NOT, AND, OR, XOR 연산|
|쉬프트|&#62;&#62;, <<, >>>|이항|숫자|비트를 좌측/우측으로 밀어서 이동|

### 연산의 방향과 우선순위
|연산자|연산 방향|우선순위|
|---|:---:|:---:|
|증감(++, --), 부호(+, -), 비트(~), 논리(!)|←|높음|
|산술(*, /, %)|→|↑|
|산술(+, -)|→|&#124;|
|쉬프트(<<, >>, >>>)|→|&#124;|
|비교(<, >, <=, >=, instanceof)|→|&#124;|
|비교(==, !=)|→|&#124;|
|논리(&)|→|&#124;|
|논리(^)|→|&#124;|
|논리(&#124;)|→|&#124;|
|논리(&&)|→|&#124;|
|논리(&#124;&#124;)|→|&#124;| 
|조건(?:)|→|↓|
|대입(=, +=, -=, *=, /=, %=, ^=, &#124;=, <<=, >>=, >>>=)|←|낮음| 

1. 단항, 이항, 삼항 연산자 순으로 우선순위를 가진다.
2. 산술, 비교, 논리, 대입 연산자 순으로 우선순위를 가진다.
3. 단항과 대입 연산자를 제외한 모든 연산의 방향은 왼쪽에서 오른쪽이다(→).
4. 복잡한 연산식에는 괄호()를 사용해서 우선순위를 정해준다.

### 단항 연산자
- 피연산자가 단 하나뿐인 연산자
#### 부호 연산자(+, -)
#### 증감 연산자(++, --)
#### 논리부정 연산자(!)
#### 비트 반전 연산자(~)

### 이항 연산자
- 피연산자가 두 개인 연산자
#### 산술 연산자(+, -, *, /, %)
#### 문자열 연결 연산자(+)
#### 비교 연산자(<, <=, >, >=, ==, !=)
~~~java
public class StringEqualsExample {
    public static void main(String[] args){
      String strVar1 = "이수빈";
      String strVar2 = "이수빈";
      String strVar3 = new String("이수빈");
      
      System.out.println(strVar1 == strVar2);           // true
      System.out.println(strVar1 == strVar3);           // false
      System.out.println();
      System.out.println(strVar1.equals(strVar2));      // true
      System.out.println(strVar1.equals(strVar3));      // true
    }
}
~~~
#### 논리 연산자(&&, &#124;&#124;, &, &#124;, ^, !)
#### 비트 연산자(&, &#124;, ^, ~, <<, >>, >>>)
#### 대입 연산자(=, +=, -=, *=, /=, %=, &=, ^=, &#124;=, <<=, >>=, >>>=)

### 삼항 연산자
> 조건식 ? 값 또는 연산식 : 값 또는 연산식

~~~java
public class ConditionalOperationExample {
    public static void main(String[] args){
      int score =85;
      char grade = (score > 90) ? 'A' : ((score > 80 ? 'B' : 'C'));
      System.out.println(score + "점 " + grade);
    }
}
~~~

## CHAPTER-04-조건문과-반복문

### 코드 실행 흐름 제어
- 실행 흐름을 개발자가 원하는 방향으로 바꿀 수 있도록 해부는 것이 흐름제어문(제어문)이다.
- 제어문을 사용할 경우 다양한 실행 흐름이 생성된다.
- 제어문 블록 내부에는 또 다른 제어문을 사용할 수 있다.
### 조건문(if문, switch문)
#### if문
~~~
if ( 조건식 ) {
    실행문;
    실행문;
    ...
}
~~~
~~~
if ( 조건식 )
    실행문;
~~~
#### if-else문
~~~
if ( 조건식 ) {

} else {

}
~~~
#### if=else if-else문
~~~
if ( 조건식1 ) {

} else if ( 조건식2 ) {

} else {

}
~~~
#### 중첩 if문
~~~
if ( 조건식1 ) {
    
    if ( 조건식2 ) {
    
    } else {
    
    }
    
} else {

}
~~~
#### switch문
~~~
switch (변수) {
    case 값1:
    
        break;
    case 값2:
    
        break;
    default:
    
}
~~~
### 반복문(for문, while문, do-while문)
#### for문
~~~
for (초기화식; 조건식; 증감식) {
    실행문;
}
~~~
#### while문
~~~
while (조건식) {
    실행문;
}
~~~
#### do-while문
~~~
do {
    실행문;
} while (조건식);
~~~
#### break문
~~~
for (...) {
 
    break;
}
~~~
~~~
while (...) {
    
    break;
}
~~~
#### continue문
~~~
for (...) {

    continue;
}
~~~
~~~
while (...) {

    continue;
}
~~~

## CHAPTER-05-참조-타입
### 데이터 타입 분류
- 기본 타입(원시 타입, primitive type) : 정수, 실수, 문자, 논리 리터럴
> 기본 타입을 이용해서 선언된 변수는 실제 값을 변수 안에 저장한다.
- 참조 타입(reference type) : 배열, 열거, 클래스, 인터페이스  
> 참조 타입을 이용해서 선언된 변수는 메모리의 번지를 값으로 갖는다. (번지를 통해 객체를 참조한다.)
- 변수는 스택영역, 객체는 힙 영역에 생성된다.
### 메모리 사용 영역
![RuntimeDataArea](https://t1.daumcdn.net/cfile/tistory/9951B14C5B8F876001)
#### 메소드(Method) 영역
- 코드에서 사용되는 클래스(~.class)들을 클래스 로더로 읽어 클래스별로 런타임 상수풀(runtime constant pool), 필드(field) 데이터, 메소드(method) 데이터, 메소드 코드, 생성자(constructor) 코드 등을 분류해서 저장한다.
- JVM이 시작할 때 생성되고 모든 스레드가 공유하는 영역이다.
#### 힙(Heap) 영역
- 객체와 배열이 생성되는 영역이다.
- 생성된 객체와 배열은 JVM 스택 영역의 변수나 다른 객체의 필드에서 참조한다.
#### JVM 스택(stack) 영역
- 각 스레드마다 하나씩 존재하며 스레드가 시작될 때 할당된다.
- JVM 스택은 메소드를 호출할 때마다 프레임(Frame)을 추가(push)하고 메소드가 종료되면 해당 프레임을 제거(pop)하는 동작을 수행한다.
### 참조 변수의 ==, != 연산
- 참조 타입 변수들 간의 ==, != 연산은 동일한 객체를 참조하는지, 다른 객체를 참조하는지 알아볼 때 사용된다.
- 참조 타입 변수의 값은 힙 영역의 객체 주소이므로 결국 주소 값을 비교하는 것이 된다.
### null과 NullPointerException
- 참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null(널) 값을 가질 수 있다.
- null로 초기화된 참조 변수는 스택 영역에 생성된다.
- NullPointerException : 참조 타입 변수를 잘못 사용하면 발생한다.
### String 타입
~~~java
String name;  
name = "수빈";  
String hobby = "자바";
~~~

- name 변수와 hobby 변수는 스택 영역에 생성되고, "수빈"과 "자바"는 힙 영역에 String 객체로 생성된다.
- 문자열은 String 객체로 생성되고 변수는 String 객체를 참조한다.
- 문자열 리터럴이 동일하다면 String 객체를 공유하도록 되어 있다.
~~~java
String name1 = new String("수빈");  
String nema2 = new String("수빈");
~~~

- new 연산자는 힙 영역에 새로운 객체를 만들 떄 사용하는 연산자로 객체 생성 연산자라고 한다.
- == 연산자는 변수에 저장된 객체 번지가 동일한지를 검사한다.
- equals() 메소드는 원본 문자열과 매개값으로 주어진 비교 문자열이 동일한지 비교한다.
- JVM은 참조되지 않은 객체를 쓰레기 객체로 취급하고 쓰레기 수집기(Gabage Collector)를 구동시켜 메모리에서 자동 제거한다.

### 배열 타입
- 배열은 같은 타입의 데이터를 연속된 공간에 나열시키고, 각 데이터에 인덱스(index)를 부여해 놓은 자료구조이다.
_ 한 번 생성된 배열은 길이를 늘리거나 줄일 수 없다.
#### 배열 선언
> 타입[] 변수;  
> 타입 변수[];

- 배열 변수는 참조 변수에 속한다.
- 배열도 객체이므로 힙 영역에 생성되고 배열 변수는 힙 영역의 객체를 참조하게 된다.
#### 값 목록으로 배열 생성
> 데이터 타입[] 변수 = { 값0, 값1, 값2, 값3, ... };

- 배열 변수를 이미 선언한 후에 다른 실행문에서 중괄호를 사용한 배열 생성은 허용되지 않는다,
#### new 연산자로 배열 생성
> 타입[] 변수 = new 타입[길이];  
>  
> 타입[] 변수 = null;  
> 변수 = new 타입[길이];

- new 연산자로 배열을 처음 생성할 경우, 배열은 자동적으로 기본값으로 초기화된다.

> 변수[인덱스] = 값;

- 배열이 생성되고 나서 새로운 값을 저장하려면 대입 연산자를 사용하면 된다.

#### 배열 길이
- 배열의 길이란 배열에 저장할 수 있는 전체 항목 수를 말한다.
> 배열변수.length;
- 만약 배열의 인덱스를 초과해서 사용하면 ArrayIndexOutOfBoundsException이 발생한다.

#### 커맨드 라인 입력

~~~java
public static void main(String[] args){ ... }
~~~

- "java  클래스"로 프로그램을 실행하면JVM은 길이가 0인 String 배열을 먼저 생성하고 main() 메소드를 호출할 깨 매개값으로 전달한다.

#### 다차원 배열
- 값들이 행과 열로서 구성된 배열을 2차원 배열이라고 한다.
- 자바는 2차원 배열을 중첩 배열 방식으로 구현한다.
~~~java
int[][] scores = new int[2][3];
~~~
![다차원배열](https://t1.daumcdn.net/cfile/tistory/995BC9465B9625272F)

- 일차원 배열이 서로 연결된 구조로 다차원 배열을 구현하기 때문에 수학 행렬 구조가 아닌 계단식 구조를 가질 수 있다
~~~java
int[][] scores = new int[2][];
scores[0] = new int[2];
scores[1] = new int[3];
~~~

#### 객체를 참조하는 배열
- 기본 타입(byte, char, short, int, long, float, double, boolean) 배열은 각 항목에 직접 값을 갖고 있지만, 참조 타입(클래스, 인터페이스) 배열은 각 항목에 객체의 번지를 가지고 있다.
~~~java
String[] strArray = new String[3];
strArray[0] = "java";
strArray[1] = "C++";
strArray[2] = "C#";
~~~
![객체를 참조하는 배열](https://t1.daumcdn.net/cfile/tistory/99624E3D5B974B2232)
- String[] 배열 항목 간에 문자열을 비교하기 위해서는 == 연산자 대신 equals() 메소드를 사용해야 한다.

#### 배열 복사
- 배열은 한 번 생성하면 크기를 변경할 수 없기 때문에 더 많은 저장 공간이 필요하다면 보다 큰 배열을 새로 만들고 이전 배열로부터 항목 값들을 복사해야 한다.
- 배열 간의 항목 값들을 복사하려면 for문을 사용하거나 System.arraycopy() 메소드를 사용하면 된다.
~~~java
System.arraycopy(Object src, int srcPos, Object dest, int destPos, int lengrh);
~~~
- 얕은 복사 (shallow copy) : 이전 항목이 참조하는 객체와 동일한 객체 참조
- 깊은 복사 (deep copy) : 참조하는 객체도 별도로 생성

#### 향상된 for문
- 향상된 for문은 반복 실행을 하기 위해 카운터 변수와 증감식을 사용하지 않는다
- 배열 빛 컬렉션 항목의 개수만큼 반복하고, 자동적으로 for문을 빠져나간다.
~~~java
for ( 타입 변수 : 배열 ) {
    실행문;
}
~~~

### 열거 타입
- 한정된 값만을 갖는 데이터 타입이 열거 타입(enumeration type)이다.
- 열거 타입은 몇 개의 열거 상수(enumeration constant)중에서 하나의 상수를 저장하는 데이터 타입이다.

#### 열거 타입 선언
- 열거 타입 이름으로 소스 파일(.java)을 생성한다.
- 열거 타입 이름은 소스 파일명과 대소문자가 모두 일치해야 한다.
~~~java
public enum Week { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
~~~
#### 열거 타입 변수
- 열거 타입도 하나의 데이터 타입이므로 변수를 선언하고 사용해야 한다.
~~~java
Week today;
~~~
- 열거 상수는 단독으로 사용할 수는 없고 반드시 열거타입.열거상수로 사용된다.
~~~java
Week today = Week.SUNDAY;
~~~
- 열거 타입도 참조 타입이다, 열거 상수는 열거 객체로 생성된다.

#### 열거 객체의 메소드
##### name() 메소드
- name() 메소드는 열거 객체가 가지고 있는 문자열을 리턴한다.
##### ordinal() 메소드
- ordinal() 메소드는 전체 열거 객체 중 몇 번째 열거 객체인지 알려준다.
##### compareTo() 메소드
- compareTo() 메소드는 매개값으로 주어진 열거 객체를 기준으로 전후로 몇 번째 위치하는지를 비교한다.
##### valueOf() 메소드
- valueOf() 메소드는 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴한다.
##### values() 메소드
- values() 메소드는 열거 타입의 모든 열거 객체들을 배열로 만들어 리턴한다.