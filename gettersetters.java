public class gettersetters{
        class Student {

    private String name;
    private int age;

    // Setter
    public void setName(String n) {
        name = n;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setAge(int a) {
        age = a;
    }

    // Getter
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Chaitanya");
        s1.setAge(19);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
}
