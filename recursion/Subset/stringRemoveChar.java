package recursion.Subset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringRemoveChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string: ");
        String str = new String(br.readLine());
        System.out.print("Enter the character you wanna remove: ");
        char ch = br.readLine().charAt(0);
        System.out.printf("The character %s is removed from %s\n", ch, str);
        String ans = removeChar(str, ch, 0);
        String ans2 = removeChar2(str, ch);
        System.out.println(ans);
        System.out.println(ans2);

        br.close();
    }

    static String removeChar(String str, char ch, int index) {
        if (index == str.length())
            return "";
        if (str.charAt(index) == ch)
            return removeChar(str, ch, index + 1);
        else
            return str.charAt(index) + removeChar(str, ch, index + 1);
    }

    static String removeChar2(String str, char ch) {
        if (str.length() == 0)
            return "";
        if (str.charAt(0) == ch)
            return removeChar2(str.substring(1), ch);
        else
            return str.charAt(0) + removeChar2(str.substring(1), ch);

    }
}
