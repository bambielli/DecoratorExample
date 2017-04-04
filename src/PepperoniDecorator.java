/**
 * Concrete decorator. Supertype is ToppingDecorator, which has a superType of Pie
 */
public class PepperoniDecorator extends ToppingDecorator{
    PepperoniDecorator(Pie wrappedPie) {
        super(wrappedPie);
    }
    public double price() {
        return this.wrappedPie.price() + 1.10;
    }

    //new private methods only accessible in this class
    private void spicy() { System.out.println("Spicy Pepperoni"); }
}
