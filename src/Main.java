import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();
        int total = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                total = total + i;
            }
        }

        if(total == number){
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }

        scanner.close();
    }
}
//6 -->1,2,3 -->  1+2+3=6
//28 -->1,2,4,7,14 --> 1+2+4+7+14=28