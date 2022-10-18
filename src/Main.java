public class Main {
    public static void main(String[] args) {
        Human Maxim = new Human("","Минск",-35,"бренд-менеджер");
        Human Anna = new Human("Аня","Москва", 29,"методист образовательных программ");
        Human Ekaterina = new Human("Катя","", 28, "продакт-менеджер");
        Human Artem = new Human("Артем", "Москва", 27,"директор по развитию бизнеса");

        Artem.introduce();
        Anna.introduce();
        Ekaterina.introduce();
        Maxim.introduce();

    }
}