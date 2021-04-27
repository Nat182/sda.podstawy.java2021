package JavaPodstawyTypy;
import java.util.Scanner;
public class Zadanie3FC {
    public static void main(String[] args){
        double C;
        double F;
        System.out.println("Prosze podac liczbe");
        Scanner wejscie = new Scanner(System.in);
        C = wejscie.nextDouble();
        System.out.println("podana temperatura w celcjuszach wynosi w fahrenheitach:");
        F = 32 + 1.8 * C;
        System.out.println(F);
    }
}
