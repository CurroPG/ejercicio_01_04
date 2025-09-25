public class App {
 public static final String RESET = "\033[0m";  // Text Reset
 
 // Regular Colors
 public static final String BLACK = "\033[0;30m";   // BLACK
 public static final String RED = "\033[0;31m";     // RED
 public static final String GREEN = "\033[0;32m";   // GREEN
 public static final String YELLOW = "\033[0;33m";  // YELLOW
 public static final String BLUE = "\033[0;34m";    // BLUE
 public static final String PURPLE = "\033[0;35m";  // PURPLE
 public static final String CYAN = "\033[0;36m";    // CYAN
 public static final String WHITE = "\033[0;37m";   // WHITE

    public static void main(String[] args) throws Exception {
        System.out.println("\u001b[0m");
        String si = "\u001b[33mSI\u001b[0m";
        String lm = "LM";
        String sos = "SOS";
        String bdato = "BDATO";
        String prog = "PROG";
        String ipe1 = "IPE1";
        String dig = "DIG";
        String ed = "ED";

        System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", si, prog, si, ipe1, bdato);

    }
}
