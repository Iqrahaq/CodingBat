package uk.ac.northumbria.haq.iqra;

public class PersonProfile {
    protected String ProfilePicture;
    protected Status Status;
    protected String Biography;

    public enum Status{
        Busy,
        Available
    }
}
