import java.util.Scanner;
public class p2q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        str = str.replaceAll("[aeiouAEIOU]", "");
        str = str.replace(' ', '_');
        String[] words = str.split("_");

        for (int i=1; i < words.length; i = i+2){
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        String result = String.join("_", words);
        int len = result.length();
        result = result + len;
        System.out.println(result);
    }
}
