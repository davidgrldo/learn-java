public class Foreach {
    public static void main(String[] args) {
        String[] names = {
            "David", "Geraldo"
        };

        // Tanpa foreach
        for(var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Dengan foreach
        for(var name : names ) {
            System.out.println(name);
        }
    }
}
