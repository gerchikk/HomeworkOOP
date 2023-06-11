public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

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
            int thisStudentPoints = this.getNobility() + this.getHonor() + this.getCourage();
            int otherStudentPoints = otherStudent.getNobility() + otherStudent.getHonor() + otherStudent.getCourage();
            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучший гриффендорец, чем %s\n", this.getName(), otherStudent.getName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучший грффиндорец, чем %s\n", otherStudent.getName(), this.getName());
            } else System.out.println("Одинаковые грифиндорцы");
        }
    }
}


