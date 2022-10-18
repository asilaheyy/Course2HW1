public class Human {
    String name;
    String hometown;
    int age;
    String job;
Human(String name, String hometown,int age, String job){
    if(name == null || name == "") {
        this.name = "*Информация не указана*";
    } else {
        this.name = name;
    }
    if(hometown == null || hometown == ""){
        this.hometown = "*Информация не указана*";
    }else {
        this.hometown = hometown;
    }
    if(age>=0) {
        this.age = age;
    } else {
        this.age = 0;
    }
    if(job == null || job == ""){
        this.job = "*Информация не указана*";
    }else {
    this.job = job;
    }
}
public void introduce(){
       int yearOfBirth = 2022 - age;
        System.out.println("Привет! Меня зовут "+name+". Я из города "+hometown+". Я родился/родилась в "+yearOfBirth+" году. Я работаю на должности "+job+". Будем знакомы!");
    }
}
