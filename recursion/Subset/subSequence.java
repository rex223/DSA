package recursion.Subset;

import java.util.ArrayList;

public class subSequence {
    public static void main(String[] args) {
        String s = "Hik";
        sequence(s, "");
        ArrayList<String> ans = Asequence(s, "");
        System.out.println(ans);
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
}
