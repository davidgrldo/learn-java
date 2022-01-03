public class Switch {
  public static void main(String[] args) {
    var nilai = 'A';

    switch (nilai) {
      case 'A':
        System.out.println("Selamat, anda lulus dengan nilai yang baik");
        break;
      case 'B':
      case 'C':
        System.out.println("Nilai anda cukup baik");
        break;
      case 'D':
        System.out.println("Anda tidak lulus");
        break;
      default:
        System.out.println("Anda salah jurusan");
    }

    var nilai2 = 'B';

    switch (nilai2) {
      case 'A' -> System.out.println("Nilai anda sangat bagus");
      case 'B', 'C' -> System.out.println("Nilai anda bagus");
      case 'D' -> System.out.println("Nilai anda kurang bagus");
      default -> {
        System.err.println("Mungkin anda salah jurusan");
      }
    }

    var nilai3 = 'A';
    String ucapan = switch (nilai3) {
      case 'A':
        yield "Nilai anda sangat bagus";
      case 'B', 'C':
        yield "Nilai anda sangat bagus";
      case 'D':
        yield "Nilai anda kurang bagus";
      default:
        yield "Mungkin anda salah jurusan";
    };

    System.out.println(ucapan);
  }
}
