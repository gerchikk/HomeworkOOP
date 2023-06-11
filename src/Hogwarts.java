public class Hogwarts {
    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    public void compareStudent(Hogwarts otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = this.getMagic() + this.getTransgression();
            int otherStudentPoints = otherStudent.getMagic() + otherStudent.getTransgression();
            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучше по силе магии и трансгрессии, чем %s\n", this.getName(), otherStudent.getName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучше по силе магии и трансгрессии, чем %s\n", otherStudent.getName(), this.getName());
            } else System.out.println("Студенты одинаковы по силе магии и трансгрессии");
        }
    }
}
