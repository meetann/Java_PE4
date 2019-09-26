import java.util.Scanner;

public class CountChar {

    public static void main(String[] args) {

        System.out.println("Enter the String: ");
        Scanner scanner = new Scanner(System.in);
        String string;
        string = scanner.nextLine();
        int lengthOfString = string.length();

        System.out.println("Enter the character you wish to count.");
        String c;
        c = scanner.next();

        int countChar = lengthOfString-string.replaceAll(c,"").length();

        System.out.println("Count of "+c+" is: "+countChar);



    }
}
