public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving.");
    }

    public void talk() {
        System.out.println(fullName + " is talking.");
    }

    public static void main(String[] args) {

        Person person1 = new Person("Yerasyl", 18);


        person1.move();
        person1.talk();
    }
}

