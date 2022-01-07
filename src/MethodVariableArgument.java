public class MethodVariableArgument {
    public static void main(String[] args) {
        // without variable argument
        // int[] values = {
        //     80, 90, 60, 66, 50
        // };
        // sayCongrats("David", values);

        // with variable argument
        sayCongrats("David", 100,90,88,67,79);
    }

    // static void sayCongrats(String name, int[] values) {
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value: values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " anda lulus.");
        } else {
            System.out.println("Maaf " + name + " tidak lulus.");
        }
    }
}