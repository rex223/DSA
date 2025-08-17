package recursion.Subset;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        perm("abc");
        
    }

    static void perm(String str){
        if (str.isEmpty()) return;
        ArrayList<String> ans = helperPermArray(str, "");
        System.out.println(ans);
        helperPerm(str, "");
    }

    private static void helperPerm(String str, String result){
        if (str.isEmpty()){
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            helperPerm(left + right, result + ch);
        }
// do it using arraylist
    }
    private static ArrayList<String> helperPermArray(String str, String result){
        ArrayList<String> list = new ArrayList<>();
        if (str.isEmpty()){
            list.add(result);
            return list;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            list.addAll(helperPermArray(left + right, result + ch));
        }
        return list;    
    }
}
