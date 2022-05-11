package zbiorFunkcji;

public class funkcje {


    public static int nieParzyste(int[] t){
        int licznik=0;

        for(int i=0;i<t.length;i++){
            if(t[i]%2==0){
                t[i]++;
                licznik++;
            }
        }
        return licznik;
    }

    public static void show(int[]t){
        for(int i=0; i<t.length;i++){
            System.out.println(t[i]);
        }
    }


}
