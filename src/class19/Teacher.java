package class19;

public class Teacher {
    /* Write a Java program called Teacher.
      Identify features and behaviour of that Class.
       Create 3 subclasses MathTeacher, ChemistryTeacher
       and PianoTeacher that would have it their own features and behaviour. Test all 4 classes*/
    protected String tName;
    protected String subject;
    protected int school;

    public Teacher(String tName, String subject, int school) {
        this.tName = tName;
        this.subject = subject;
        this.school = school;
    }

    void isTeaching() {
        System.out.println("Teacher " + tName + " is teaching " + subject + " nat school #" + school);
    }
}

class MathTeacher extends Teacher {


    public MathTeacher(String tName, String subject, int school) {
        super(tName, subject, school);
    }
}

class ChemistryTeacher extends Teacher {

    public ChemistryTeacher(String tName, String subject, int school) {
        super(tName, subject, school);
    }
}

class PianoTeacher extends Teacher {

    String piano;
    public PianoTeacher(String tName, String subject, int school, String piano) {
        super(tName, subject, school);
        this.piano=piano;
    }
}

class testInIt {
    public static void main(String[] args) {
        MathTeacher teacher1 = new MathTeacher("Ms. Nesser", "math", 26);
        teacher1.isTeaching();
        ChemistryTeacher teacher2 = new ChemistryTeacher("Ms. Sapralieva", "chemistry", 76);
        teacher2.isTeaching();
        PianoTeacher teacher3 = new PianoTeacher("Mr. Drewbinsky", "piano", 33, "Grand");
        teacher3.isTeaching();


    }
}