package JavaPodstawyPetleITablice;
//Odliczenie do wybuchu bomby
import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int zegar;


        for(zegar= sc.nextInt(); zegar > 0; zegar-- ){
            System.out.println("Bomba wybuchnie za " + zegar);

        }System.out.println("Bum");

    }

}
