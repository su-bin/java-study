public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "이수빈";
        String strVar2 = "이수빈";

        if (strVar1 == strVar2) {
            System.out.println("1,2 참조 같음");
        } else {
            System.out.println("1,2 참조 다름");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("1,2 문자열 같음");
        }

        String strVar3 = new String("이수빈");
        String strVar4 = new String("이수빈");

        if (strVar3 == strVar4) {
            System.out.println("3,4 참조 같음");
        } else {
            System.out.println("3,4 참조 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("3,4 문자열 같음");
        }
    }
}
