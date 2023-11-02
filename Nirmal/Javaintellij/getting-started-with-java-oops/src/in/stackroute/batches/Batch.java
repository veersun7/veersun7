package in.stackroute.batches;

import in.stackroute.learners.Learner;
import in.stackroute.mentors.Mentor;

public class Batch {

    private Learner[] learners;

    // Has-A relationship
    private Mentor mentor;

    public void setBatchDetails(Learner [] learners, Mentor mentor){
        this.learners = learners;
        this.mentor = mentor;
    }
}
