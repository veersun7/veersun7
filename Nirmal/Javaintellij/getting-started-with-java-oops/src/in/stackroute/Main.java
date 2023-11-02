// package is the first statement in a java file
// you cannot have more than one package statement in a java file
package in.stackroute;

// import statement is used to import a java class from
// a different package. There can be multiple import statements
// in a single java file.

//import in.stackroute.learners.Learner;
//import in.stackroute.mentors.Mentor;

import in.stackroute.employees.Engineer;
import in.stackroute.employees.President;

public class Main {

    public static void main(String[] args) {

//        Mentor mentorObj = new Mentor();
//        mentorObj.print();

//        Engineer engineer = new Engineer();

        President president = new President();
        president.setDetails("E001", "King");
        president.details();
    }
}
