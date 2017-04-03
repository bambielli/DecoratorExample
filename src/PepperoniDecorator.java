/**
 * Concrete decorator. Supertype is ToppingDecorator, which has a superType of Pie
 */
public class PepperoniDecorator extends ToppingDecorator{
    Pie wrappedPie;
    PepperoniDecorator(Pie wrappedPie) {
        this.wrappedPie = wrappedPie;
    }
    public double price() {
        return this.wrappedPie.price() + 1.10;
    }
}
