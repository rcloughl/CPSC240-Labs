import java.text.DecimalFormat;
import java.util.Random;

public class Student {

    private String firstName;
    private String lastName;
    private int idNum;
    private double gpa;
    private int numCredits;

    private static int nextId=0;

    public Student(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.idNum = getNextId();
        this.gpa=0;
        this.numCredits=0;
    }

    static int getNextId(){
        nextId = nextId+1;
        return nextId;
    }

    private void addCourse(int classCredits, String grade) {
        double classGpa = 0.0;
        String letter = grade.substring(0, 1);
        String symbol = grade.substring(1);

        if (letter.equals("A"))
            classGpa += 4;

        if (letter.equals("B"))
            classGpa += 3;

        if (letter.equals("C"))
            classGpa += 2;

        if (letter.equals("D"))
            classGpa += 1;

        if (letter.equals("F"))
            classGpa += 0;

        if (symbol.equals("-"))
            classGpa -= .3;

        if (symbol.equals("+"))
            classGpa += .3;

        this.gpa = ((this.gpa * numCredits) + (classGpa * classCredits)) / (this.numCredits + classCredits);
        this.numCredits = numCredits + classCredits;
    }

    private void report(){

        DecimalFormat df1 = new DecimalFormat("#.##");
        System.out.print(this.firstName+", "+this.lastName+" "+this.idNum);
        System.out.println("   "+ df1.format(this.gpa) +"  " + this.numCredits);
    }

    private boolean canGraduate(){
        if (this.gpa>=2.0 && this.numCredits>=120)
            return true;
        else
            return false;
    }

    //Start of given code

    public static void main(String [] args) {
        // make three generic students
        Student alice = new Student("Alice", "Johnson");
        Student bob = new Student("Bob", "Williams");
        Student claire = new Student("Claire", "Smith");

        // starting report
        alice.report();
        bob.report();
        claire.report();

        // we randomly pull credit numbers and grades from these
        // arrays - this gives us reasonable testing data
        int[] credits = {1, 3, 3, 3, 3, 3, 3, 3, 4, 4};
        String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"};
        Random gen = new Random();

        // give them each 40 random classes
        for (int i = 0; i < 40; i++) {
            int creditIdx = gen.nextInt(credits.length);
            int gradeIdx = gen.nextInt(grades.length);
            bob.addCourse(credits[creditIdx], grades[gradeIdx]);

            creditIdx = gen.nextInt(credits.length);
            gradeIdx = gen.nextInt(grades.length);
            alice.addCourse(credits[creditIdx], grades[gradeIdx]);

            creditIdx = gen.nextInt(credits.length);
            gradeIdx = gen.nextInt(grades.length);
            claire.addCourse(credits[creditIdx], grades[gradeIdx]);
        }

        // print reports now
        System.out.println();
        alice.report();
        bob.report();
        claire.report();

        // see if they can graduate
        System.out.printf("Alice %s graduate.\n", alice.canGraduate() ? "can" : "CAN'T");
        System.out.printf("Bob %s graduate.\n", bob.canGraduate() ? "can" : "CAN'T");
        System.out.printf("Claire %s graduate.\n", claire.canGraduate() ? "can" : "CAN'T");
    }
    //End of given code

}

