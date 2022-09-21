import java.util.Scanner;

public class getBattery {

    public static void main(String[] args){

        final int CARGATOTAL = 100;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] eventos = new int[n];

        int carga = 50;
        int carregamento = 0;
        int descarregamento = 0;

        for (int i = 0; i < eventos.length; i++){
            eventos[i] = sc.nextInt();
            if (eventos[i] > 0) {
                carregamento += eventos[i];
                carga += carregamento;
                if (carga > 100){
                    int diff = carga - 100;
                    carga -= diff;
                }
            } else {
                descarregamento += eventos[i];
                carga += descarregamento;
                if(carga < 0){
                    carga = 0;
                }
            }
            System.out.println(carga);
        }
    }
}
