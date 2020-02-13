import java.util.Scanner;

public class Cliente {
    
    Scanner s = new Scanner(System.in);        

    public static void main(String[] args) {
        System.out.println("¿Que pizza desea comer?\n 1=champiñones \n 2=piña");
        ProxyPizza proxy = new ProxyPizza();
        proxy.comer(s.nextInt());
    }
}
