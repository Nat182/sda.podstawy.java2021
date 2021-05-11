package JavaPodstawyOop;
import java.util.Scanner;

// chccemy miec kalkulator ktory zczytuje od uyztkownika nazwe figury oraz jej niezbedne wymiary i obicza
// obwod i pole powierzchni
// dodaj trojkat 1. stworz klase trojkat 2. dopisz metody potrzebne do zczytania 3 bokow i obliczenia obwodu
// 3. przemysl solidnie jak zaprojektowac metode liczaca pole
// podpowiedz: potrzebujemy wysokosci trojkata, ktora inaczej liczy sie dla
// trojkatow rownobocznych, prostokatnych i roznobocznych

// do kazdej figury byly getery setery i konstruktor

public class MainFigury {
    public static void main(String[] args){

        System.out.println("Podaj nazwe figury");
        Scanner input = new Scanner(System.in);
        String figura = input.next();

        if(figura.equals("kolo")){
            KoloFigury kolo = new KoloFigury();
            kolo.zczytaj();

            System.out.println("wymiary kola");
            System.out.println("obwod: " + KalkulatorFigury.obliczObwod(kolo));
            System.out.println("pole: " + KalkulatorFigury.obliczPole(kolo));







        }
        else if(figura.equals("prostokat")){
                ProstokatFigury prostokat = new ProstokatFigury();
                prostokat.zczytaj();

                System.out.println("wymiary prostokata");
                System.out.println("obwod: " + KalkulatorFigury.obliczObwod(prostokat));
                System.out.println("pole: " + KalkulatorFigury.obliczPole(prostokat));


        }
        else{
            System.out.println("nie ma takiej figury");

        }
    }


    }
