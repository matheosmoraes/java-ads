// Nome completo: preencher aqui.
public class Exercicio01 {
    public static void main(String[] args) {
        String[] controles = {
            "NUL", "SOH", "STX", "ETX", "EOT", "ENQ", "ACK", "BEL",
            "BS", "TAB", "LF", "VT", "FF", "CR", "SO", "SI",
            "DLE", "DC1", "DC2", "DC3", "DC4", "NAK", "SYN", "ETB",
            "CAN", "EM", "SUB", "ESC", "FS", "GS", "RS", "US"
        };
        for (int codigo = 0; codigo <= 127; codigo++) {
            if (codigo < 32) {
                System.out.printf("%3d: %s%n", codigo, controles[codigo]);
            } else if (codigo == 127) {
                System.out.printf("%3d: DEL%n", codigo);
            } else {
                System.out.printf("%3d: %c%n", codigo, (char) codigo);
            }
        }
    }
}
