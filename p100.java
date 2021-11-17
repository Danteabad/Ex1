import java.util.Scanner;

public class p100 {
    public static void main(String[]args) {
        int num1;fffhghgfhgfg
        int num2;
        int operacio;
        Scanner teclat = new Scanner (System.in);
        System.out.print("Escriu un numero: ");
        num1 = teclat.nextInt();
        System.out.print("Escriu un numero: ");
        num2 = teclat.nextInt();
        System.out.print("\n1) Suma ");
        System.out.print("\n2) Resta");
        System.out.print("\n3) Multiplicació");
        System.out.print("\n4) Divisió");
        System.out.print("\nQuina operació vols fer: ");
        operacio = teclat.nextInt();
        switch (operacio){
            case 1:
            System.out.print((num1 + num2));
            break;

            case 2:
            System.out.print((num1 - num2));
            break;

            case 3: 
            System.out.print((num1 * num2));
            break;

            case 4:
            System.out.print((num1 / num2));
            break;

        }
    }
}