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
}
