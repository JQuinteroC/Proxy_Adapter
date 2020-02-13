
public class Adaptar implements Pizza {

    PizzaPine p = new PizzaPine();

    @Override
    public void Comer() {
        p.Terminar();
    }
}
