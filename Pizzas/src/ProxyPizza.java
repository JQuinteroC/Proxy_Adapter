
public class ProxyPizza implements Pizza {

	Pizza pizza;

    @Override
    public void Comer(int seleccion) {
        if (seleccion == 1){
            pizza = new PizzaChamp();
        } else{
            pizza = new Adaptar();
        }
        pizza.comer();
    }
}
