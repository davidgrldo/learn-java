public class KonversiNumber {
  public static void main(String[] args) {
    // Widening Casting (otomatis)
    byte iniByte = 10;
    //// byte ke short
    short iniShort = iniByte;
    //// short ke int
    int iniInt = iniShort;
    //// int ke long
    long iniLong = iniInt;
    //// long ke float
    float iniFloat = iniLong;
    //// float ke double
    double iniDouble = iniFloat;

    // Narrowing Casting (manual)
    //// double ke float
    float iniFloat2 = (float) iniDouble;
    //// float ke long
    long iniLong2 = (long) iniFloat2;
    //// long ke int
    int iniInt2 = (int) iniLong2;
    //// int ke short
    short iniShort2 = (short) iniInt2;
    //// short ke byte
    byte iniByte2 = (byte) iniShort2;
  }
}