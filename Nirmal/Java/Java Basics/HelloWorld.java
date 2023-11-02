// Java source code must be written inside a class
// Java source code files has a .java extension
// Java code execution starts from the main method
// Java source code files must have the same name as of the public class

public class HelloWorld {

    /****************************************************************************************
     * Java identifier naming rules
     * 
     * 1. Identifiers can be composed of letters, digits, $ and _ example: userName, userName1,
     * user_name, user$name (valid)
     * 
     * 2. Identifiers cannot start with a digit example: 1userName (invalid)
     * 
     * 3. Identifiers cannot be a Java keyword example: public (invalid)
     * 
     * 4. Identifiers are case sensitive example: userName and UserName are different identifiers
     * 
     * 5. Identifiers cannot have white spaces example: user name (invalid)
     * 
     * ***************************************************************************************
     * 
     * Identifier naming conventions
     * 
     * 1. Class names should start with an uppercase letter and they shoudl follow upper camel case
     * naming convention.
     * 
     * example: HelloWorld, HelloWorld1, HelloWorldApp, HelloWorldApp1
     * 
     * 2. Method names should start with a lowercase letter and they should follow lower camel case
     * naming convention.
     * 
     * example: main, main1, mainMethod, mainMethod1
     * 
     * 3. Variable names should start with a lowercase letter and they should follow lower camel
     * case naming convention.
     * 
     * example: userDetails1, userPerformanceDetails, userDetails
     * 
     * 4. Constant names should be in all uppercase letters and they should follow upper snake case
     * naming convention.
     * 
     * example: USER_DETAILS, USER_DETAILS_1, USER_DETAILS_2, AVERAGE_USER_MARKS
     * 
     * ***************************************************************************************
     */

    /*
     * This is the main method, main is the entry point of the program main method is a special
     * method, it has a special purpose and it is called by the JVM when the program is executed
     */
    public static void main(String[] args) {
        System.out.println("Hello World");

        /**
         * Datatypes
         * 
         * Numeric datatypes in java are byte, short, int, long, float, double. Among them byte,
         * short, int, long are integer datatypes (whole numbers) and float, double are floating
         * point datatypes (decimal numbers. By default all decimal numbers are treated as double,
         * if you want to treat a decimal number as float, you have to suffix it with f or F,
         * example: 10.5f
         * 
         * These datatypes are also called as primitive datatypes
         * 
         */

        byte byteVar = 1;
        short shortVar = 2;
        int intVar = 3;
        long longVar = 4;

        float floatVar = 5.5f;
        double doubleVar = 6.6;

        /**
         * character datatype: char
         **/
        char x = 'x';

        /**
         * boolean datatype: boolean
         */
        boolean isTrue = true;

        /**
         * In additiona to the primitive datatypes, Java also provides a special datatype called
         * String. String is not a primitive datatype, it is a class. String is used to represent a
         * sequence of characters. String is also called as a reference datatype or a non primitive
         * datatype.
         */
        String str = "Hello World";

        /**
         * Operators in Java
         * 
         * Artihmetic operators: +, -, *, /, %
         * 
         * Assignment operators: =, +=, -=, *=, /=, %=
         * 
         * Comparison operators: ==, !=, >, <, >=, <=
         * 
         * Logical operators: &&, ||, !
         * 
         */

        // Arithmetic operators
        int a = 100;
        int b = 20;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Assignment operators
        int c = 10;
        c += 10; // c = c + 10
        System.out.println("c = " + c);

        c -= 10; // c = c - 10
        System.out.println("c = " + c);

        c *= 10; // c = c * 10
        System.out.println("c = " + c);

        c /= 10; // c = c / 10
        System.out.println("c = " + c);

        c %= 10; // c = c % 10
        System.out.println("c = " + c);

        // Comparison operators
        int d = 10;
        int e = 20;

        System.out.println("d == e IS " + (d == e)); // false
        System.out.println("d != e IS " + (d != e)); // true
        System.out.println("d > e IS " + (d > e)); // false
        System.out.println("d < e IS " + (d < e)); // true
        System.out.println("d >= e IS " + (d >= e)); // false
        System.out.println("d <= e IS " + (d <= e)); // true

        // Logical operators
        boolean f = true;
        boolean g = false;

        System.out.println("f && g IS " + (f && g)); // false
        System.out.println("f || g IS " + (f || g)); // true
        System.out.println("!f IS " + !f); // false

        /**
         * Control statements in Java
         * 
         * 1. if statement
         * 
         * 2. if else statement
         * 
         * 3. if else if else statement
         * 
         * 4. switch statement
         * 
         * 5. while loop
         * 
         * 6. do while loop
         * 
         * 7. for loop
         * 
         * 8. break statement
         * 
         * 9. continue statement
         * 
         * 10. return statement
         * 
         */

        // if statement
        int h = 10;
        if (h == 10) {
            System.out.println("h is equal to 10");
        }

        // if else statement
        int i = 10;
        if (i == 10) {
            System.out.println("i is equal to 10");
        } else {
            System.out.println("i is not equal to 10");
        }

        // if else if else statement
        int j = 10;
        if (j == 10) {
            System.out.println("j is equal to 10");
        } else if (j == 20) {
            System.out.println("j is equal to 20");
        } else {
            System.out.println("j is not equal to 10 or 20");
        }
        // switch statement
        int k = 10;
        switch (k) {
            case 10:
                System.out.println("k is equal to 10");
                break;
            case 20:
                System.out.println("k is equal to 20");
                break;
            default:
                System.out.println("k is not equal to 10 or 20");
                break;
        }

        // while loop
        int l = 0;
        while (l < 10) {
            System.out.println("l = " + l);
            l++;
        }

        // do while loop
        int m = 0;
        do {
            System.out.println("m = " + m);
            m++;
        } while (m < 10);

        // for loop
        for (int n = 0; n < 10; n++) {
            System.out.println("n = " + n);
        }

        // break statement
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("break statement");
        for (int o = 0; o < 10; o++) {
            if (o == 5) {
                break;
            }
            System.out.println("o = " + o);
        }
        // continue statement
        System.out.println("continue statement");
        for (int p = 0; p < 10; p++) {
            if (p == 5) {
                continue;
            }
            System.out.println("p = " + p);
        }

        // return statement
        int q = 10;
        if (q == 10) {
            return;
        }
        System.out.println("q = " + q);

    }
}