



public class methods_overloading {
    static void foo() {
        System.out.println("good morning");

    }

    static void foo(int a) {
        System.out.println("good morning " + a + "bro");
    }

    public static void main(String[] args) {
        foo();
        foo(300);
    }

}


