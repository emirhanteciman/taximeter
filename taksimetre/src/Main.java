import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double startPrice= 10 ,km,perKm = 2.20 ,total,total2 = 20 ;
        Scanner input  = new Scanner(System.in);

        System.out.println("Lütfen gittiğiniz mesafeyi giriniz: ");
        km = input.nextInt();
        System.out.println("Gittiğiniz mesafe: " + km);

        total = (km * perKm) + startPrice;

        if (km>10){
            System.out.println("Toplam tutar: " + total + " TL ");
        }
        else {
            System.out.println("toplam tutar:  " + total2 +" TL ");
        }
    }
}