import java.util.Scanner;

public class p124 { hola
    public static void main(String[]args) {
        char caracter;
        Scanner teclat = new Scanner (System.in);
        System.out.print("Escriu un caracter: ");
        caracter = teclat.next().charAt(0);
        /*Character.isUpperCase(caracter);
        Character.isLowerCase(caracter);*/
        if (caracter >= 'a' && caracter <= 'z'){
            System.out.print("El caracter és una lletra minúscula");
        }
        else if (caracter >= 'A' && caracter <= 'Z'){
            System.out.print("El caracter és una lletra majúscula");
        }
        else if (caracter >= '0' && caracter <= '9'){
            System.out.print("El caracter és un numero");
        }
        else{
            System.out.print("El caracter és un signo");
        }
    }
}