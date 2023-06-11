public class Kogtevran extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, int magic, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void compareKogtevranStudent(Kogtevran otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = this.getIntelligence() + this.getWisdom() + this.getWit() + this.getCreativity();
            int otherStudentPoints = otherStudent.getIntelligence() + otherStudent.getWisdom() + otherStudent.getWit() + otherStudent.getCreativity();
            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучший когтевранец, чем %s\n", this.getName(), otherStudent.getName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучший когтевранец, чем %s\n", otherStudent.getName(), this.getName());
            } else System.out.println("Одинаковые когтевранцы");
        }
    }
}
