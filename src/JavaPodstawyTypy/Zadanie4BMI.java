package JavaPodstawyTypy;
import java.util.Scanner;
public class Zadanie4BMI {
    public static void main(String[] args) {
        double kg;
        double m;
        double bmi;
        System.out.println("Podaj wage w kg");
        Scanner waga = new Scanner(System.in);
        kg = waga.nextDouble();
        System.out.println("Podaj wzrost w cm");
        Scanner wzrostcm = new Scanner(System.in);
        m = wzrostcm.nextDouble();
        System.out.println("Twoje BMI wynosi:");
        bmi = kg / (m * m);
        System.out.println(bmi);

    }



}
