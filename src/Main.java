import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String forecast = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Palindromik olup olmadigini kontrol etmek istedigin kelimeyi gir: ");
        forecast = input.nextLine();

        if (isPalindrome(forecast)){
            System.out.println(forecast + " Tahmininde bulundugunuz kelime palindrom bir kelimedir.");
        } else {
            System.out.println(forecast + " Tahmininde bulundugunuz kelime palindrom bir kelime degildir.");
        }

    }
}