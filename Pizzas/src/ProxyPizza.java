
public class ProxyPizza implements Pizza {

    Pizza pizza;
    private int seleccion;

    @Override
    public void Comer() {
        try {
            switch (seleccion) {
                case 1:
                    pizza = new PizzaChamp();
                    break;
                case 2:
                    pizza = new Adaptar();
                    break;
            }
            pizza.Comer();
        } catch (Exception e) {
            System.out.println("No es opción valida. Proceso finalizado");
            System.exit(0);
        }
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

}
