import java.time.LocalDate;

public class Human {
   private String name;
    private String hometown;
    private int birthYear;
   private String job;

   public Human(String name, String hometown, int birthYear, String job) {
       setName(name);
       setHometown(hometown);
       setJob(job);
       setBirthYear(birthYear);
    }

    public String toString(){
        return "Привет! Меня зовут " + name + ". Я из города " + hometown + ". Я родился/родилась в " + birthYear + " году. Мне "+getAgeInYears()+" лет. Я работаю на должности " + job + ". Будем знакомы!";
    }

    public void setName(String name) {
        this.name = Validation.validOrDefaultValue(name, "*Информация не указана*" );
    }

    public void setHometown(String hometown) {
        this.hometown = Validation.validOrDefaultValue(hometown, "*Информация не указана*");
    }

    public void setJob(String job) {
        this.job = Validation.validOrDefaultValue(job, "*Информация не указана*");
    }

    public void setBirthYear(int birthYear){
        this.birthYear = Math.max(birthYear, 0);
   }
    public String getHometown() {
        return hometown;
    }

    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }
    public int getBirthYear() {
        return birthYear;
    }
   private int getAgeInYears(){
       int currentYear = LocalDate.now().getYear();
       return currentYear - this.birthYear;
   }
}
