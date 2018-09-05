public class StringConcatExample {
    public static void main(String[] args) {
        String str1 = "hello" + 6.0;
        String str2 = str1 + " 안녕";
        System.out.println(str2);

        String str3 = "hi" + 3 + 3.0;
        String str4 = 3 + 3.0 + "hi";
        System.out.println(str3);
        System.out.println(str4);
    }
}
