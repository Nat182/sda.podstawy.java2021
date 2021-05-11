package JavaPodstawyWarunki;
import java.util.Scanner;
public class ZadanieE {
    public static void main(String[] args){
        System.out.println("Podaj liczbe");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Podaj druga liczbe");

        int b = sc.nextInt();

        System.out.println("Podaj rodzaj dzialania");

        String c = sc.next();

        switch (c){
            case "+":
                System.out.println( a + b );
                break;
            case "-":
                System.out.println( a - b );
                break;
            case "*":
                System.out.println( a * b );
                break;
            case "/":
                System.out.println( a / b );
                break;
            default:
                System.out.println("Bledny znak");
                break;

            }
        }

    }


