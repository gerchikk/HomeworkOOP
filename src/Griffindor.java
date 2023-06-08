public class Griffindor extends Hogwarts {
    private static int nobility;
    private static int honor;
    private static int courage;

    public Griffindor(String name, int magic, int transgression, int nobility, int honor, int courage) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void compareGriffindorStudent(Griffindor otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = nobility + honor + courage;
            System.out.println(thisStudentPoints);
            int otherStudentPoints = otherStudent.getNobility() + otherStudent.getHonor() + otherStudent.getCourage();
            System.out.println(otherStudentPoints);
            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучший грифендорец, чем %s\n", getName(), otherStudent.getName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучший грфиндорец, чем %s\n", otherStudent.getName(), getName());
            } else System.out.println("Одинаковые грифиндорцы");
        }
    }
}


