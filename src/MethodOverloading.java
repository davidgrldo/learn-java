public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("David");
        sayHello("David", "Geraldo");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.err.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.err.println("Hello " + firstName + " " + lastName);
    }
}
