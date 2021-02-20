package uk.ac.northumbria.haq.iqra;

import java.util.HashMap;

public class Person {
    protected String PersonID;
    protected Type Type;
    protected PersonName Name;
    protected PersonContact Contact;
    protected PersonProfile Profile;
    protected HashMap<Instruments, Levels> Skills = new HashMap<Instruments, Levels>();


    public enum Type {
        Student,
        Teacher
    }

    public enum Instruments {
        Violin,
        Guitar,
        Piano,
        Drums
    }

    public enum Levels {
        Beginner,
        Intermediate,
        Advanced,
        Expert
    }

}
