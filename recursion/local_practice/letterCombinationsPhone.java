package recursion.local_practice;

public class letterCombinationsPhone {
    public static void main(String[] args) {
        letterCombo("12305");
    }

    private static void letterCombo(String str) {
        if (str.isEmpty())
            return;
        helperCombo(str, "");
    }

    private static void helperCombo(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }
        int digit = str.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit) * 3; i++) {
            if (digit == 1 || digit == 0) {
                helperCombo(str.substring(1), result);
                return;
            } else {
                char ch = (char) ('a' + i);
                helperCombo(str.substring(1), result + ch);
            }
        }
    }
}
// 2 - abc
// 3 - def
// 4 - ghi
// 5 - jkl