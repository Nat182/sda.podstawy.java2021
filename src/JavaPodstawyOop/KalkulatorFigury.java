package JavaPodstawyOop;

public class KalkulatorFigury {
    public static double obliczObwod(KoloFigury kolo){
        double wynik;
        wynik = 2 * Math.PI * kolo.getR();
        return wynik;


    }

    public static double obliczPole(KoloFigury arg_kolo){
        return Math.PI * arg_kolo.getR() * arg_kolo.getR();

    }
    public static double obliczObwod(ProstokatFigury prostokat){
        return prostokat.getA() * 2 + prostokat.getB() * 2;


    }
    public static double obliczPole(ProstokatFigury prostokat){
        return prostokat.getA() * prostokat.getB();

    }



    }


