import java.util.Scanner;

public class asalSayiAraligi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " , ");
            }
        }
    }
}
