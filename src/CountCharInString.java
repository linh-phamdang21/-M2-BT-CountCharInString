import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        String str = "Pham Dang Linh";
        String inputChar;
        int count = 0;
        String[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your String: " + str);
        System.out.println("Enter a character to count: ");
        inputChar = scanner.nextLine();
        arr = str.split("");
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(inputChar)){
                count++;
            }
        }
        System.out.println("Character in String: " + count);
    }
}
