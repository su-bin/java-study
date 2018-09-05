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
####중첩 if문
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
