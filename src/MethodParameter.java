public class MethodParameter {
    public static void main(String[] args) {
        sayHello("David", "Geraldo");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName);
    }
}
