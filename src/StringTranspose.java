import java.util.Scanner;

public class StringTranspose {

    public static void main(String[] args){
        System.out.println("Enter the string input: ");
        String stringInput;
        Scanner scanner = new Scanner(System.in);
        stringInput = scanner.nextLine();
        System.out.println("The transpose is: ");
        String reverseString="";

        String[] splitString = stringInput.split(" ");
        for(int i=0;i<splitString.length;i++) {
            for(int j=splitString[i].length()-1; j>=0; j--) {
                reverseString = reverseString + splitString[i].charAt(j);
            }
            System.out.print(reverseString+ " ");
            reverseString = "";
//            System.out.println(" ");
        }
    }
}
