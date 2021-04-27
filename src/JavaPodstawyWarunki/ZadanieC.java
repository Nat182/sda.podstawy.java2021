package JavaPodstawyWarunki;
import java.util.Scanner;
public class ZadanieC {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe od 1 do 7");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch (number) {
            case 1: {
                System.out.println("Poniedzialek");
                break;
            }
            case 2: {
                System.out.println("Wtorek");
                break;
            }
            case 3: {
                System.out.println("Sroda");
                break;
            }
            case 4: {
                System.out.println("Czwartek");
                break;
            }
            case 5: {
                System.out.println("Piatek");
                break;
            }
            case 6: {
                System.out.println("Sobota");
                break;
            }
            case 7: {
                System.out.println("Niedziela");
                break;
            }
            default : {
                System.out.println("ERROR");
                break;
            }
        }
    }
}
