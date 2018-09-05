public class CheckOverflowExample {
    public static void main(String[] args) {
        try {
            int result = safeAdd(200000000, 200000000);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("overflow");
        }
    }

    public static int safeAdd(int left, int right) {
        if(right > 0) {
            if (left < Integer.MAX_VALUE - right) {
                throw new ArithmeticException("overflow");
            }
        } else {
            if(left < Integer.MIN_VALUE - right) {
                throw new ArithmeticException("overflow");
            }
        }
        return left + right;
    }
}
