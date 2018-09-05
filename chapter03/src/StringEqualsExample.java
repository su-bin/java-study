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
