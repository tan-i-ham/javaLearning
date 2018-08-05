public class p18_14 {
    public static boolean testPalimdrome(String text) {
        // System.out.printf("%s\n", text);
        if (text.length() == 1) {
            return true;
        } else if (text.length() == 2 && (text.charAt(0) == text.charAt(1))) {
            return true;
        } else {
            String c = String.valueOf(text.charAt(0));
            // System.out.printf("%s\n", c);
            if (text.endsWith(c)) {
                return testPalimdrome(text.substring(1, text.length() - 1));
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        String temp = "able was i ere i saw elba";
        String input = "";
        // clear the space
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if (c == ' ') {
                continue;
            } else {
                input = input.concat(String.valueOf(c));
            }
        }
        System.out.printf("%s\n", String.valueOf(testPalimdrome(input)));
    }
}