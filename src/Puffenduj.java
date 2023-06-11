public class Puffenduj extends Hogwarts {
    private int hardWork;
    private int loyality;
    private int honesty;

    public Puffenduj(String name, int magic, int transgression, int hardWork, int loyality, int honesty) {
        super(name, magic, transgression);
        this.hardWork = hardWork;
        this.loyality = loyality;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void comparePuffendujStudent(Puffenduj otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = this.getHardWork() + this.getLoyality() + this.getHonesty();
            int otherStudentPoints = otherStudent.getHardWork() + otherStudent.getLoyality() + otherStudent.getHonesty();
            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучший пуффендуец, чем %s\n", this.getName(), otherStudent.getName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучший пуффендуец, чем %s\n", otherStudent.getName(), this.getName());
            } else System.out.println("Одинаковые пуффендуйцы");
        }
    }
}
