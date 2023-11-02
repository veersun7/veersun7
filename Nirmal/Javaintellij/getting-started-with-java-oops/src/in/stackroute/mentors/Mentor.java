package in.stackroute.mentors;

public class Mentor {

    /**
     * class level variables, these variables are accessible throughout the class
     * all class level variables are initialized by java to their default values
     */
    private int id;
    private String name;
    private String email;
    private String[] topics;

    /**
     * Constructor in java.
     * Constructors are special methods which get executed automatically when
     * an object of the class is created.
     * To declare a constructor in java we have to follow certain rules
     * - constructor method has the same name as that of the class
     * - constructor method has no return type
     * - constructor method can have parameters
     */

    public Mentor() {
        System.out.println("Mentor class constructor...");
        System.out.println(id + " " + name + " " + email + " " + topics);
    }

    public void print() {
        /**
         * this is string variable which is local to the method print()
         * or in other words it is only accessible inside the method
         * whenever a local variable is declared the developer needs to initialize it.
         *
         * Initialization before use principle in java states that all local
         * variables must be initialized before they can be used.
         */
        String str = "";
        int x = 0;
        System.out.println("This is a mentor class object.");
        System.out.println(str + " " + x);
    }
}
