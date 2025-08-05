package recursion.Subset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class removeString {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string: ");
        String str = new String(br.readLine());
        System.out.print("Enter the character you wanna remove: ");
        String ch = br.readLine();
        System.out.printf("The character %s is removed from %s\n", ch, str);
        int length = ch.length();
        String ans = removeString(str, ch);
        System.out.println(ans);

        br.close();
    }

    static String removeString(String str, String ch){
        if (str.isEmpty()) return "";
        if (str.startsWith(ch)) return removeString(str.substring(ch.length()), ch);
        else return str.charAt(0) + removeString(str.substring(1), ch);

    }

}
