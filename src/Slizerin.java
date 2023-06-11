public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustOfPower;

    public Slizerin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }
    public void compareSlizerinStudent(Slizerin otherStudent) {
        if (otherStudent != null) {
            int thisStudentPoints = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustOfPower();
            int otherStudentPoints = otherStudent.getCunning() + otherStudent.getDetermination() + otherStudent.getAmbition() + otherStudent.getResourcefulness() + otherStudent.getLustOfPower();
            if (thisStudentPoints > otherStudentPoints) {
                System.out.printf("%s лучший слизеринец, чем %s\n", this.getName(), otherStudent.getName());
            } else if (thisStudentPoints < otherStudentPoints) {
                System.out.printf("%s лучший слизерниц, чем %s\n", otherStudent.getName(), this.getName());
            } else System.out.println("Одинаковые слизеринцы");
        }
    }
}
