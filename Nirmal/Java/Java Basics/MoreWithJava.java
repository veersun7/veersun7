public class MoreWithJava {
    
        public static void main(String[] args) {
    
            /**
             * String is a non primitive data type also known as a reference type. String is a class in
             * the java.lang package.
             */
            String str = "Hello";
    
            // Using the methods in the String class
            // @see https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
            // 1. length() - returns the length of the string
            System.out.println("The string '" + str + "'' has " + str.length() + " characters");
    
            // 2. charAt() - returns the character at the specified index
            System.out.println("The character at index 1 is " + str.charAt(1));
    
            // 3. indexOf() - returns the index of the first occurrence of the specified character
            System.out.println("The index of the first occurrence of 'l' is " + str.indexOf('l'));
            System.out.println("The index of the first occurrence of 'o' is " + str.indexOf('o'));
            if (str.indexOf('z') == -1) {
                System.out.println("The character 'z' is not in the string '" + str + "'");
            }

            // 4. substring() - returns a substring of the string
            System.out.println("The substring from index 1 to 3 is " + str.substring(1, 3));
    
            // 5. toUpperCase() - returns the string in all uppercase
            System.out.println("The string '" + str + "' in all uppercase is " + str.toUpperCase());

            // 6. toLowerCase() - returns the string in all lowercase
            System.out.println("The string '" + str + "' in all lowercase is " + str.toLowerCase());
    
            // 7. equals() - returns true if the string is equal to the specified string and false otherwise
            String str2 = "hello";
            System.out.println(
                    "Checking for the equality of the string '" + str + "' and '" + str2 + "'");
            if (str.equals("hello")) {
                System.out.println("The string '" + str + "' is equal to 'hello'");
            } else {
                System.out.println("The string '" + str + "' is not equal to 'hello'");
            }
    
            // 8. equalsIgnoreCase() - returns true if the string is equal to the specified string ignoring case
            System.out.println(
                    "Checking for the equality of the string '" + str + "' and '" + str2 + "' ignoring the case");
            if (str.equalsIgnoreCase("hello")) {
                System.out.println("The string '" + str + "' is equal to 'hello'");
            } else {
                System.out.println("The string '" + str + "' is not equal to 'hello'");
            }
    
            // 9. trim() - returns a copy of the string with leading and trailing whitespace omitted
            String str3 = "   Hello   ";
            System.out.println("Before trimming the string '" + str3 + "' has " + str3.length() + " characters");
    
            String str4 = str3.trim();
            System.out.println("After trimming the string '" + str3 + "' has " + str4.length() + " characters");
    
            System.out.println();
            System.out.println();
            System.out.println("strip() method");
            System.out.println("Before stripping the string '" + str4 + "' has " + str3.length() + " characters");
    
            str4 = str3.strip();
            System.out.println("After stripping the string '" + str4 + "' has " + str4.length() + " characters");
    
            str4 = str3.stripLeading();
            System.out.println("After stripping the leading whitespace the string '" + str4 + "' has " + str4.length() + " characters");
    
            str4 = str3.stripTrailing();
            System.out.println("After stripping the trailing whitespace the string '" + str4 + "' has " + str4.length() + " characters");
    
            // 10. replace() - returns a copy of the string with the specified character replaced with the specified character
            System.out.println("The string '" + str + "' with 'l' replaced with 'z' is " + str.replace('l', 'z'));
    
        }
    
    }