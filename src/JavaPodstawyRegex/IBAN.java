package JavaPodstawyRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IBAN {
    public static void main(String[] args){
        String ibanRegex = "[A-Z]{2}[0-9]{28}";
        Pattern ibanPattern = Pattern.compile(ibanRegex);

        String input = "AZ12345671234567123456712345678";
        Matcher nasz_matcher = ibanPattern.matcher(input);
        if (nasz_matcher.matches()){
            System.out.println("IBAN jest poprawny");
        }
        else {
            System.out.println("IBAN nie jest poprawny");
        }

    }
}
