import java.util.Scanner;

public class program65{

    public static void main(String[] args) {

        char ch;
        int ascii;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string:");

        String str = sobj.nextLine();

        StringBuilder sb = new StringBuilder(str);
        System.out.println("Entered string is: " + sb);

        for (int i = 0; i < sb.length(); i++) {

            ch = sb.charAt(i);
            ascii = (int) ch;

            // Toggle case only for alphabetic characters
            if (ascii >= 'a' && ascii <= 'z') { // Lowercase to uppercase
                sb.setCharAt(i, (char) (ascii - 32));
            } else if (ascii >= 'A' && ascii <= 'Z') { // Uppercase to lowercase
                sb.setCharAt(i, (char) (ascii + 32));
            }
        }

        System.out.println("Toggle string is: " + sb);

        sobj.close();
    }
}
