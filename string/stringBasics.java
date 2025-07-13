package string;

// Strings are immutable. u need to know abt two things one is string POOL and string immutability

// String pool is a special memory region where java stores string literals.It is stored in heap memory. Suppose there is a string literal "hello" in the code, it will be stored in the string pool. If we create another string with the same value, it will point to the same memory location in the string pool instead of creating a new object. This helps in saving memory and improving performance.

// Strings are immutable, meaning once a string is created, its value cannot be changed.(for security reasons). Suppose we have a string "hello" and we want to change it to "world". Instead of changing the original string, Java creates a new string object with the new value and points the reference to the new object. This is done to ensure that the original string remains unchanged and can be reused if needed.

public class stringBasics{
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");

        System.out.println("Check by reference");
        System.out.println(s1==s2); // both point to the same memory location in the string pool
        System.out.println(s1==s3); // s3 points to a different memory location in the heap
        System.out.println("Check by value");
        System.out.println(s1.equals(s3)); // compares the values of the strings, so it returns true
        System.out.println("\n");
        System.out.println("Character at index 0: "+s1.charAt(0)); // prints 'h'
        System.out.println("Length of string: "+s1.length()); // prints 5
        
        System.out.println("Substring from index 1 to 3: "+s1.substring(1,3)); // prints "el"
        System.out.println("s1"+"s2");// prints "s1s2" because it concatenates the two strings without any space
        System.out.println('a'+'b'); // prints 195, because 'a' and 'b' are converted to their ASCII values and added together
        System.out.println("s1"+" "+s2); // prints "s1 hello"
        System.out.println('a'+3); // prints 100, because 'a' is converted to its ASCII value and 3 is added to 
        
        // StringBuilder vs strings 
        // StringBuilder is mutable, meaning its value can be changed after it is created. This makes it more efficient for string manipulation operations like appending, inserting, or deleting characters. Strings are immutable, meaning once a string is created, its value cannot be changed. This can lead to performance issues when performing multiple string manipulations, as each operation creates a new string object.
        // StringBuilder is more efficient for string manipulation operations, while strings are more suitable for simple string operations where immutability is desired.
        String series=" ";
        for(int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i); // 'a' + i gives the ASCII value of the character
            series=series+ch;
        }
        System.out.print(series); // prints the character
        // The above code with no streing builder takes o(n^2) time complexity the below code takes o(n) time complexity
        // This is because in the abve code since strings are immutable it creates a new string everytime the ch value is updated
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i); 
            sb.append(ch); // appends the value of ch to the StringBuilder object
        }
        System.out.println("\n");
        System.out.println("sb: "+sb); // prints the StringBuilder object
    }
}