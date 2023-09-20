package divisible;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Divisible {

    public void EjemploIf() {
        int n, d;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce dos enteros: ");
        n = entrada.nextInt();
        d = entrada.nextInt();
        if (n % d == 0) {
            System.out.println(n + " Es divisible por " + d);
        }
    }

    public void EjemploIf2() {
        int n, d;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce dos enteros: ");
        n = entrada.nextInt();
        d = entrada.nextInt();
        if (n % d == 0) {
            System.out.println(n + " Es divisible por " + d);
        } else {
            System.out.println("No cumple we xdxdxd");
        }
    }

    public static void main(String[] args) {
        Divisible div = new Divisible();
        div.EjemploIf2();
    }

}
