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

    public void eat(Apple apple) {
if (apple.isEmpty()){
    apple.weight--;
    System.out.println(this.name + " ăn 1 miếng táo");
    System.out.println("Còn " + apple.getWeight() + "miếng táo");
}else {
    System.out.println(this.name + " đã hết táo");
}
    }

    public void sleep() {
        System.out.println("zzZZ");
    }
}
