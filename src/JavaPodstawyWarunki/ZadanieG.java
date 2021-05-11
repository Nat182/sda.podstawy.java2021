package JavaPodstawyWarunki;
import java.util.Scanner;

// napisz program ktory bedzie spr czy liczba jest podzielna przez 3 i wtedy drukowal slowo Fizz
// albo czy jest podzielna przez 5 i wtedy drukuje slowo Bizz

public class ZadanieG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe");

        int liczba;
        liczba = sc.nextInt();

        if(liczba % 3 == 0){
            System.out.println("Fizz");

        }else if(liczba % 5 == 0){
            System.out.println("Bizz");

        }else{
            System.out.println("liczba nie jest podzielna przez 3 i 5");
        }
    }

}
