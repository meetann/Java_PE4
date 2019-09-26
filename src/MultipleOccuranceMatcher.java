import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccuranceMatcher {

        public static void main(String[] args){

            String str1;
            String str2;
            String finalString="";

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the string: ");
            str1 = scanner.nextLine();
            System.out.println("Enter part of the string: ");
            str2 = scanner.next();

            Pattern pattern = Pattern.compile(str2);
            Matcher matcher = pattern.matcher(str1);

            while(matcher.find()) {
                System.out.println("Found at: " + matcher.start() + " - " + matcher.end()+", ");
                finalString=finalString+("Found at: " + matcher.start() + " - " + matcher.end()+", ");
            }

            //System.out.println(finalString.trim());
        }
    }
