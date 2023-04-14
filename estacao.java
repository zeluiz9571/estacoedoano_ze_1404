import java.util.*;
import java.lang.Math;

public class estacao {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int dia, mes;
        
        System.out.println("Informe o mês: ");
        mes = input.nextInt();
        System.out.println("Informe o dia: ");
        dia = input.nextInt();
        if (mes == 1 || mes == 2 || mes == 3) {
            if (mes == 3 && dia >= 20) {
                System.out.println("Outono");
            } else {
                System.out.println("Verão");
            }
        } else {
            if (mes == 4 || mes == 5 || mes == 6) {
                if (mes == 6 && dia >= 21) {
                    System.out.println("Inverno");
                } else {
                    System.out.println("Outono");
                }
            } else {
                if (mes == 7 || mes == 8 || mes == 9) {
                    if (mes == 9 && dia >= 23) {
                        System.out.println("Primavera");
                    } else {
                        System.out.println("Inverno");
                    }
                } else {
                    if (mes == 12 && dia >= 21) {
                        System.out.println("Verão");
                    } else {
                        System.out.println("Primavera");
                    }
                }
            }
        }
    }
}
