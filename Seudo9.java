import java.util.Scanner;

public class Seudo9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1 = 1;
        int t2;
        double promedio;
        while (t1 != 0) {
            System.out.println("Ingrese las dos temperaturas");
            t1 = scanner.nextInt();
            t2 = scanner.nextInt();
            if (t1 != 0) {
                if (t1 >= 5 && t1 <= 15 && t2 >= 5 && t2 <= 15) {
                    promedio = (t1 + t2) / (double) 2;
                    System.out.println("El promedio es " + promedio);
                } else {
                    System.out.println("Temperatura ingresada no esta entre 5 y 15 grados, no aplica a calculo de promedio");
                }
            }
        }
    }
}