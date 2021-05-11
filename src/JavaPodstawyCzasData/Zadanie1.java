package JavaPodstawyCzasData;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
// wypisz biezaca date, czas i datetime korzystajac z wybranych formatterow

public class Zadanie1 {
    public static void main(String[] args){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_TIME;

        System.out.println(dateFormatter.format(localDateTime));
        System.out.println(dateFormatter.format(localDate));
        System.out.println(timeFormatter.format(localTime));





    }
}
