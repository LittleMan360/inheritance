import java.util.Calendar;

public class Person {
    //Attributes
    String FirstName;
    String LastName;
    String ID;
    String Title;
    int YOB;

    //Constructors

    //set up person requirements
    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
        Title = title;
        this.YOB = YOB;
    }


    //Getter And Setters//
    //getFirstName
    public String getFirstName() {
        return FirstName;
    }
    //setFirstName
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    //getLastName
    public String getLastName() {
        return LastName;
    }
    //setLastName
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    //getID
    public String getID() {
        return ID;
    }
    //setID
    public void setID(String ID) {
        this.ID = ID;
    }
    //getTitle
    public String getTitle() {
        return Title;
    }
    //setTitle
    public void setTitle(String title) {
        Title = title;
    }
    //getYOB
    public int getYOB() {
        return YOB;
    }
    //setYOB
    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    //To String///
    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", ID='" + ID + '\'' +
                ", Title='" + Title + '\'' +
                ", YOB=" + YOB +
                '}';
    }


    //Full Name
    public String FullName()
    {
        return FirstName + "" + LastName;
    }

    //Formal Name
    public String FormalName()
    {
        return Title + "" + FirstName + "" + LastName;
    }

    //Age
    public int getAge()
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return (year - YOB);
    }
    //Age
    public int getAge(int year)
    {
        return (year - YOB);
    }

    //CVS
    public String toCSVDataRecord()
    {
        return ID + "," + FirstName + "," + LastName + "," + Title + "," + YOB;
    }
}