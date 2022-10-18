public class Human {
    String name;
    String hometown;
    int age;
    String job;

    Human(String name, String hometown, int age, String job) {
        this.name = name;
        nameNull();
        this.hometown = hometown;
        hometownNull();
        this.age = age;
        ageNull();
        this.job = job;
        jobNull();
    }

    Human() {
        this.name = "*Информация не указана*";
        this.hometown = "*Информация не указана*";
        this.job = "*Информация не указана*";
        this.age = 0;
    }

    public void introduce() {
        int yearOfBirth = 2022 - age;
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + hometown + ". Я родился/родилась в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

    public void nameNull() {
        if (name == null || name.isEmpty()) {
            this.name = "*Информация не указана*";
        } else {
            this.name = name;
        }
    }

    public void hometownNull() {
        if (hometown == null || hometown.isEmpty()) {
            this.hometown = "*Информация не указана*";
        } else {
            this.hometown = hometown;
        }
    }

    public void ageNull() {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public void jobNull() {
        if (job == null || job.isEmpty()) {
            this.job = "*Информация не указана*";
        } else {
            this.job = job;
        }
    }
}
