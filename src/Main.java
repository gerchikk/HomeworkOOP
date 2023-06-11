public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер", 85, 50, 80, 77, 90),
                new Griffindor("Гермиона Грейнджер", 65, 95, 75, 65, 70),
                new Griffindor("Рон Уизли", 45, 50, 70, 72, 45),

        };
        Puffenduj[] puffendujs = {
                new Puffenduj("Захария Смит", 60, 71, 58, 47,68),
                new Puffenduj("Седрик Диггори", 75, 75, 62, 57, 79),
                new Puffenduj("Джастин Финч-Флетчли", 35, 18, 34, 75, 86),
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу Чанг", 46, 37, 65,73,54,62),
                new Kogtevran("Падма Патил", 34, 45, 75, 54, 24, 85),
                new Kogtevran("Маркус Белби", 63, 52, 73, 46, 38, 35),
        };
        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", 70, 61, 65, 75, 85, 35, 34),
                new Slizerin("Грэхэм Монтегю", 35, 63, 57, 34,24, 75, 25),
                new Slizerin("Грегори Гойл", 24, 25, 28, 42, 75, 35, 75),
        };
        Methods.print(griffindors);
        System.out.println("Следующий факультет");
        Methods.print(puffendujs);
        System.out.println("Следующий факультет");
        Methods.print(kogtevrans);
        System.out.println("Следующий факультет");
        Methods.print(slizerins);
        System.out.println();
        System.out.println("Сравнение студентов Гриффиндора:");
        griffindors[0].compareGriffindorStudent(griffindors[1]);
        System.out.println("Сравнение студентов Пуффендуя:");
        puffendujs[1].comparePuffendujStudent(puffendujs[2]);
        System.out.println("Сравнение студентов Когтеврана:");
        kogtevrans[2].compareKogtevranStudent(kogtevrans[0]);
        System.out.println("Сравнение студентов Слизерина:");
        slizerins[0].compareSlizerinStudent(slizerins[2]);
        System.out.println();
        System.out.println("Сравнение студентов Гриффиндора и Слизерина:");
        griffindors[0].compareStudent(slizerins[0]);
        System.out.println("Сравнение студентов Слизерина и Пуффендуя:");
        slizerins[1].compareStudent(puffendujs[2]);
        System.out.println("Сравнение студентов Пуффендуя и Когтеврана:");
        puffendujs[1].compareStudent(kogtevrans[0]);
        System.out.println("Сравнение студентов Когтеврана и Гриффиндора:");
        kogtevrans[1].compareStudent(griffindors[2]);
    }
}