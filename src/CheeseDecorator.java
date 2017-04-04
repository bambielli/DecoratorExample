/**
 * Concrete decorator.
 * Supertype is ToppingDecorator, which has a superType of Pie
 */

public class CheeseDecorator extends ToppingDecorator {
    CheeseType cheeseType;

    public CheeseDecorator(Pie wrappedPie, CheeseType cheeseType) {
        super(wrappedPie);
        this.cheeseType = cheeseType;
    }

    // delegates price to the wrappedPie.price() and adds the price of the cheeseType
    public double price() {
        return wrappedPie.price() + this.cheeseType.getPrice();
    }
}
