public class Methods {
    public static void print(Griffindor[] griffindors) {
        System.out.println("_____________________________");
        System.out.println("Численность студентов факультета Гриффиндор - " + griffindors.length);
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println("Имя студента - " + griffindor.getName()
                    + "\nСила магии - " + griffindor.getMagic()
                    + "\nТрансгрессия - " + griffindor.getTransgression()
                    + "\nБлагородство - " + griffindor.getNobility()
                    + "\nЧесть - " + griffindor.getHonor()
                    + "\nХрабрость - " + griffindor.getCourage());
            System.out.println("_____________________________");
        }
    }
    public static void print(Puffenduj [] puffendujs) {
        System.out.println("_____________________________");
        System.out.println("Численность студентов факультета Пуффендуй - " + puffendujs.length);
        for (int i = 0; i < puffendujs.length; i++) {
            Puffenduj puffenduj = puffendujs[i];
            System.out.println("Имя студента - " + puffenduj.getName()
                    + "\nСила магии - " + puffenduj.getMagic()
                    + "\nТрансгрессия - " + puffenduj.getTransgression()
                    + "\nТрудолюбие - " + puffenduj.getHardWork()
                    + "\nВерность - " + puffenduj.getHonesty()
                    + "\nЧестность - " + puffenduj.getLoyality());
            System.out.println("_____________________________");
        }
    }
    public static void print(Kogtevran [] kogtevrans) {
        System.out.println("_____________________________");
        System.out.println("Численность студентов факультета Пуффендуй - " + kogtevrans.length);
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println("Имя студента - " + kogtevran.getName()
                    + "\nСила магии - " + kogtevran.getMagic()
                    + "\nТрансгрессия - " + kogtevran.getTransgression()
                    + "\nУм - " + kogtevran.getIntelligence()
                    + "\nМудрость - " + kogtevran.getWisdom()
                    + "\nОстроумие - " + kogtevran.getWit()
                    + "\nТворчество - " + kogtevran.getCreativity());
            System.out.println("_____________________________");
        }
    }
    public static void print(Slizerin [] slizerins) {
        System.out.println("_____________________________");
        System.out.println("Численность студентов факультета Пуффендуй - " + slizerins.length);
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println("Имя студента - " + slizerin.getName()
                    + "\nСила магии - " + slizerin.getMagic()
                    + "\nТрансгрессия - " + slizerin.getTransgression()
                    + "\nХитрость - " + slizerin.getCunning()
                    + "\nРешительность - " + slizerin.getDetermination()
                    + "\nАмбициозность - " + slizerin.getAmbition()
                    + "\nНаходчивость - " + slizerin.getResourcefulness()
                    + "\nЖажда власти - " + slizerin.getLustOfPower());
            System.out.println("_____________________________");
        }
    }


}
