public class program {
    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b'));
    }

    static String buildString(int n, char c1, char c2) {
        String result = "";

        for (int i = 0; i < n / 2; i++) {
            result += c1;
            result += c2;
        }

        return result;
    }

}