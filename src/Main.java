import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int[] list = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("5 Adet Dizi Elamanı Giriniz: ");

        for (i = 0; i < list.length; i++){
            int number = input.nextInt();
            list[i] =number;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}