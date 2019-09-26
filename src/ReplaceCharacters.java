import java.util.Scanner;

public class ReplaceCharacters {

    public static void main(String[] args){
        System.out.println("Enter the string:");
        String string;
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();

        string=string.replaceAll("d", "f");
        string =string.replaceAll("l","t");

        System.out.println(string);


    }
}
