package JavaPodstawyRegex;
// napisz walidator dla numeru PESEL

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Pesel {
    public static void main(String[] args){
        String peselRegex = "[0-9]{11}";
        Pattern peselPattern = Pattern.compile(peselRegex);

        String input = "89021502843";
        Matcher matcher = peselPattern.matcher(input);

        if(matcher.matches()){
            System.out.println("pesel jest poprawny");

        }
        else{
            System.out.println("pesel nie jest poprawny");

        }
    }
}
