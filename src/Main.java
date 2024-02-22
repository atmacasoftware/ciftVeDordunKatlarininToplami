import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam=0, durum=0;
        Scanner input = new Scanner(System.in);

        while(durum == 0){
            System.out.print("Sayı giriniz : ");
            sayi = input.nextInt();

            if(sayi%2 == 1){
                durum = -1;
                System.out.println("Tek sayı girdiniz! Program sonlandırıldı.");
            }else{
                if(sayi%4==0){
                    toplam += sayi;
                }
            }

        }
        System.out.println("Sayıların Toplamı : " + toplam);

    }
}