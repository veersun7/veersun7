public class WorkingWithMethods {
    
        // If you don't create a constructor, Java will create a default constructor
        // for you.
    
        public static void main(String[] args) {
            // main is the entry point of the program
            WorkingWithMethods obj = new WorkingWithMethods();
    
            obj.sayHello();
    
            obj.sayHelloToUser("Ashish");
    
            obj.sayHelloToUserWithTitle("Ashish", "Mr");
    
            String[] arr = {"abc", "", "xyz", "", "pqr"};
    
            MethodWithReturnValues mvrObj = new MethodWithReturnValues();
    
            int countOfEmptyStrings = mvrObj.countEmptyStrings(arr);
            System.out.println("Count of empty strings: " + countOfEmptyStrings);
    
            String testStr = "abcba";
            boolean isPalindrome = mvrObj.isStringPalindrome(testStr);
            System.out.println("Is " + testStr + " a palindrome? " + isPalindrome);
    
        }
    
        /*
         * To create a method in java, we use the following syntax:
         * 
         * access_specifier return_type method_name (parameter_list) {}
         * 
         * access_specifier: public, private, protected, default
         * 
         * access_modifier: static, final, abstract, synchronized
         * 
         * return_type: void, int, double, String, etc.
         */
    
        public void sayHello() {
            System.out.println("Hello from Java");
        }
    
        public void sayHelloToUser(String userName) {
            System.out.println("Hello " + userName);
        }
    
        public void sayHelloToUserWithTitle(String userName, String title) {
            System.out.println("Hello " + title + " " + userName);
        }
    
    }
    
    
    class MethodWithReturnValues {
    
        /*
         * Create a method that will take a string array as a parameter and return the count of all
         * empty strings in the array
         * 
         * String[] arr = {"abc", "", "xyz", "", "pqr"};
         */
    
        public int countEmptyStrings(String[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].isEmpty()) {
                    count++;
                }
            }
            return count;
        }
    
        public boolean isStringPalindrome(String str) {
    
            // abcba
            int i = 0;
            int j = str.length() - 1;
    
            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
    
            return true;
        }
    
    }