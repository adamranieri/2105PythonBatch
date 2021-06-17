package practical;

// A Java Bean is a specific type of Java class
// 1. All fields must be private
// 2. All fields should be access via a public getter and setter
// 3. There MUST be a no args constructor (you can have more constructor)
// 4. (optional) implement serializable. Serializable is not deprecated in Java so......

// A POJO Plain Old Java Object is any class that is NOT a bean
public class Person {

    private int personId;
    private String fname;
    private String lname;

    // A lot of Java best practice guidelines say to write a no args constructor even if it does nothing
    // rather than use the implicit one
    public Person() {
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
