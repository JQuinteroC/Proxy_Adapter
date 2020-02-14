
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ProxyPizza proxy = new ProxyPizza();

        System.out.println("¿Que pizza desea comer?\n 1=champiñones \n 2=piña");
        proxy.setSeleccion(s.nextInt());
        proxy.Comer();
    }
}
