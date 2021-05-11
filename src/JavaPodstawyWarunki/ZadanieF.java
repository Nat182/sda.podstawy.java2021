package JavaPodstawyWarunki;
import java.util.Scanner;
// program sprawdzajacy czy podana liczba przez uzytkownika jest parzysta czy nieparzysta

public class ZadanieF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe");

        int liczba;
        liczba = sc.nextInt();

        if (liczba %2 == 0){
            System.out.println("Liczba jest parzysta");



        }else {
            System.out.println("liczba jest nieparzysta");

        }



    }
}
