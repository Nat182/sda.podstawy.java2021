package JavaPodstawyTypy;
// program ktory bedzie pobieral od uzytkownika dystans, czas, przeliczy go na metry/sukunde, metry na godzine
// i mile na godzine
import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj dystans w m");
        double dystans;
        dystans = input.nextDouble();

        System.out.println("Podaj liczbe godzin");
        double godziny;
        godziny = input.nextDouble();

        System.out.println("Podaj liczbe minut");
        double minuty;
        minuty = input.nextDouble();

        System.out.println("Podaj liczbe sekund");
        double sekundy;
        sekundy = input.nextDouble();

        double metrynasekunde;
        double metrynagodzine;
        double milenagodzinę;

        metrynasekunde = dystans/((godziny*3600) + (minuty*60) + (sekundy));
        metrynagodzine = dystans/((godziny) + (minuty/60) + (sekundy/3600));
        milenagodzinę = (dystans/1609)/((godziny) + (minuty/60) + (sekundy/3600));
        System.out.println("Twoje Prędkość w metrach na sekundę: " + metrynasekunde);
        System.out.println("Twoje Prędkość w metrach na godzinę: " + metrynagodzine);
        System.out.println("Twoje Prędkość w milach na godzinę: " + milenagodzinę);







    }
}
