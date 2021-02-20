package uk.ac.northumbria.haq.iqra;

public class PersonName {
    protected Title Title;
    protected String FirstName;
    protected String MiddleName;
    protected String LastName;

    public enum Title{
        Mr,
        Miss,
        Mrs,
        Mx,
        Dr
    }
}
