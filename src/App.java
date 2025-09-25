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
        String si = "SI";
        String lm = "LM";
        String sos = "SOS";
        String bdato = "BDATO";
        String prog = "PROG";
        String ipe1 = "IPE1";
        String dig = "DIG";
        String ed = "ED";

        System.out.printf(RESET+"%-20s%-20s%-20s%-20s%-20s%n", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES"+RESET);
        System.out.printf(RED+"%-20s"+GREEN+"%-20s"+RED+"%-20s"+YELLOW+"%-20s"+BLUE+"%-20s%n", si, prog, si, ipe1, bdato);
        System.out.printf(RED+"%-20s"+GREEN+"%-20s"+RED+"%-20s"+YELLOW+"%-20s"+BLUE+"%-20s%n", si, prog, si, ipe1, bdato);
        System.out.printf(PURPLE+"%-20s"+GREEN+"%-20s"+YELLOW+"%-20s"+GREEN+"%-20s"+RED+"%-20s%n", lm, prog, ipe1, prog, si);
        System.out.printf(PURPLE+"%-20s"+BLUE+"%-20s"+WHITE+"%-20s"+GREEN+"%-20s"+CYAN+"%-20s%n", lm, bdato, dig, prog, ed);
        System.out.printf(BLUE+"%-20s"+BLUE+"%-20s"+GREEN+"%-20s"+GREEN+"%-20s"+CYAN+"%-20s%n", bdato, bdato, prog, prog, ed);
        System.out.printf(BLUE+"%-20s"+BLACK+"%-20s"+GREEN+"%-20s"+PURPLE+"%-20s"+CYAN+"%-20s%n"+RESET, bdato, sos, prog, lm, ed);
    }
}
