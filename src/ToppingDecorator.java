/**
 * An abstract class that extends Pie. This is necessary so our concrete
 * decorators share the TYPE of the class we intend to decorate.
 */
public abstract class ToppingDecorator extends Pie {
    public abstract double price();
}
