package recursion.Subset;

import java.util.ArrayList;

public class subSequence {
    public static void main(String[] args) {
        String s = "Hik";
        sequence(s, "");
        sequence2(s);
        System.out.println("\n");
        ArrayList<String> ans = Asequence(s, "");
        ArrayList<String> ans2 = Asequence2(s);
        System.out.println(ans);
        System.out.println(ans2);
    }

    static void sequence(String s, String str) {
        if (s.isEmpty()) {
            System.out.println(str);
            return;
        }
        char ch = s.charAt(0);
        sequence(s.substring(1), str);
        sequence(s.substring(1), str + ch);
        return;
    }

    static ArrayList<String> Asequence(String s, String str) {
        if (s.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(str);
            return result;
        }
        char ch = s.charAt(0);
        ArrayList<String> left = Asequence(s.substring(1), str);
        ArrayList<String> right = Asequence(s.substring(1), str + ch);
        left.addAll(right);
        return left;
    }

    private static void sequence2(String s) {
        if (s.isEmpty())
            return;
        String accumulator = "";
        helperSequence2(s, accumulator);

        return;
    }

    private static void helperSequence2(String s, String accumulator) {
        if (s.isEmpty()) {
            System.out.println(accumulator);
            return;
        }
        helperSequence2(s.substring(1), accumulator);
        helperSequence2(s.substring(1), accumulator + s.charAt(0));
        return;
    }

    private static ArrayList<String> Asequence2(String s) {
        if (s.isEmpty())
            return new ArrayList<>();
        String accumulator = "";
        return helperAsequence2(s, accumulator);
    }

    private static ArrayList<String> helperAsequence2(String s, String accumulator) {
        if (s.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(accumulator);
            return result;
        }
        ArrayList<String> left = helperAsequence2(s.substring(1), accumulator);
        ArrayList<String> right = helperAsequence2(s.substring(1), accumulator + s.charAt(0));
        left.addAll(right);
        return left;
    }

}
