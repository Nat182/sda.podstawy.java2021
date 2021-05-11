package JavaPodstawyCzasData;
// wczytaj czas od uzytkownika i wypisz date i czas w strefie America / Detroit
// podpowiedz: wczytah string i uzyt parsera (linijki 23-25 w przykladzie)
// podpowiedz 2: do zmiany strefy uzyj obiektu klasy Clock

import java.time.*;
import java.time.format.DateTimeFormatter;
public class Zadanie2 {
    public static void main(String[] args){

        Clock clock = Clock.system(ZoneId.of("America/Denver"));
        LocalDateTime localDateTime = LocalDateTime.now(clock);
        LocalDate localDate = LocalDate.now(clock);
        LocalTime localTime = LocalTime.now(clock);

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);


    }
}
