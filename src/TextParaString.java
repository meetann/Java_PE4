import java.util.*;

public class TextParaString {

    public static void main(String[] args){

        System.out.println("Enter the paragraph of string :");
        String string;
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();

        String[] splitString = string.split(" ");
        List<String> listString = new ArrayList<>();

        for(int i=0;i<splitString.length;i++){
            listString.add(splitString[i]);
        }
        Collections.sort(listString);
        System.out.println("Sorted array is:");

        for (String temp : listString){
            System.out.println(temp);
        }
    }
}
