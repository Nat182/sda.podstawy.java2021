package JavaPodstawyWarunki;
import java.util.Scanner;
public class ZadanieD {
    public static void main(String[] args) {
        System.out.println("Podaj nazwe dnia tygodnia");
        String day;
        Scanner input = new Scanner(System.in);
        day = input.next();

        switch (day) {
            case "poniedzialek":
                System.out.println('1');
                break;
            case "wtorek":
                System.out.println('2');
                break;
            case "sroda":
                System.out.println('3');
                break;
            case "cywartek":
                System.out.println('4');
                break;
            case "piatek":
                System.out.println('5');
                break;
            case "sobota":
                System.out.println('6');
                break;
            case "niedziela":
                System.out.println('7');
                break;

            default:
                System.out.println("ERROR");


        }
    }
}
