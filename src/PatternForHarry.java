import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternForHarry {

    public static void main(String[] args){
        System.out.println("Enter input:");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        Pattern pat=Pattern.compile("\\s?[Hh]arry\\s?");

        Matcher mat=pat.matcher(string);
        if(mat.find())
        {
            System.out.println("Is Harry found:true");
        }
        else
            System.out.println("Is Harry found:false");
    }
}
