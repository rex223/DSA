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
        System.out.println(ans);

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
}
