public class Array {
  public static void main(String[] args) {
    String[] stringArray;
    stringArray = new String[3];

    stringArray[0] = "David";
    stringArray[1] = "Geraldo";
    stringArray[2] = "Pakpahan";

    System.out.println(stringArray[0]);
    System.out.println(stringArray[1]);
    System.out.println(stringArray[2]);

    stringArray[0] = "John";

    System.out.println(stringArray[0]);

    String[] stringArray2 = new String[3];

    String[] nama = {
      "David", "Geraldo", "Pakpahan"
    };

    nama[0] = null;

    int[] arrayInt = new int[] {
      1,2,3,4,5,6,7,8,9,0
    };

    long[] arrayLong = {
      10L, 20L, 30L
    };

    arrayLong[0] = 0;
    System.out.println(arrayLong.length);

    String[][] member = {
      {"David", "Geraldo"},
      {"Analaizer", "Eva"}
    };

    System.out.println(member[0][1]);
    System.out.println(member[1][0]);
  }
}
