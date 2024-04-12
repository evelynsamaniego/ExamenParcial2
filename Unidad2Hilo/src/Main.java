import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Conteo hilo = new Conteo() {

            void Num(int numero, String nombre) {
                System.out.println("Años cumplidos de "+ nombre + ": "+ numero);
            }
        };

        hilo.start();
    }
}