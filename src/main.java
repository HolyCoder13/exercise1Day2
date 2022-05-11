import zbiorFunkcji.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int rozmiar=0;

        do{
            System.out.println("Podaj rozmiar tablicy");
            rozmiar=sc.nextInt();
        }while(rozmiar<=0);


        int[] tablica1 = new int[rozmiar];

        System.out.println("Podaj elementy tablicy");

        for(int i=0;i<tablica1.length;i++){
            tablica1[i]=sc.nextInt();
        };

        System.out.println("Wyswietlam wproadzona tablice");
        funkcje.show(tablica1);
        System.out.println("Wproadam zmiany funkcja");
        funkcje.nieParzyste(tablica1);
        System.out.println("Wyswitlam zmiany");
        funkcje.show(tablica1);

    }
}
