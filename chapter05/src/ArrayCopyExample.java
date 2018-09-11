public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newSrtArray = new String[5];

        System.arraycopy(oldStrArray, 0, newSrtArray, 0, oldStrArray.length);

        for (int i = 0; i < newSrtArray.length; i++) {
            System.out.println(newSrtArray[i] + ", ");
        }
    }
}
