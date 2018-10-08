package Eden;

public class Human {
    String name;
    Boolean gender;
    int age;

    public Human() {
    }

    public Human(String name, Boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public String setGender(Boolean gender) {
        if (gender) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(String word) {
        System.out.println("Human say: " + word);
    }

    public void eat() {

    }

    public void sleep() {
        System.out.println("zzZZ");
    }
}
