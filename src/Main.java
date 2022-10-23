public class Main {
    public static void main(String[] args) {
        Human Maxim = new Human("Максим", "Москва", 30,"кк");
        Human Anna = new Human("Аня"," ", 29,"методист образовательных программ");
        Human Ekaterina = new Human("Катя", "", 26, "продакт-менеджер");
        Human Artem = new Human("", null, 27,"директор по развитию бизнеса");
        Human Vladimir = new Human("Владимир", "Казань", 21, "безработный");

        Artem.toString();
        Anna.toString();
        Ekaterina.toString();
        Vladimir.setBirthYear(2020);
        Maxim.toString();
        Vladimir.toString();
        System.out.println(Maxim);
        System.out.println(Vladimir);
        System.out.println(Artem);
        System.out.println(Anna);
        System.out.println(Ekaterina);

    }
}