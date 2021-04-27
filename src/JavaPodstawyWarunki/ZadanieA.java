package JavaPodstawyWarunki;
import java.util.Scanner;
public class ZadanieA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Z tych bokow da sie zbdudowac trojkat");
        } else {
            System.out.println("Z tych bokow nie da sie zbudowac trojkata");

        }
    }
}

