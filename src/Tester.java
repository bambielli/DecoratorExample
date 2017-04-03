/**
 * Created by bambielli on 4/2/17.
 */
public class Tester {
    public static void main(String[] args) {
        //give me a deep dish pepperoni pizza with mozzarella!
        Pie pizza1 =
                new PepperoniDecorator(
                    new CheeseDecorator(
                        new DeepDish()
                        , CheeseType.MOZZARELLA
                    )
                );

        //...oh and I'd like a cheese thinCrust with
        // mozzarella, parmesean, bleu and cheddar cheeses!
        Pie pizza2 =
            new CheeseDecorator(
                new CheeseDecorator(
                    new CheeseDecorator(
                        new CheeseDecorator(
                            new ThinCrust()
                            , CheeseType.CHEDDAR
                        ), CheeseType.BLEU
                    ), CheeseType.PARMESEAN
                ), CheeseType.MOZZARELLA
            );

        // Next I want a DeepDish with just pepperoni and no cheese
        Pie pizza3 =
            new PepperoniDecorator(
                new DeepDish()
            );

        // And finally I just want a thin crust with no toppings at all
        Pie pizza4 = new ThinCrust();

        // Now what is the total for all of those?
        System.out.println("pizza1 total is: " + pizza1.price());
        System.out.println("pizza2 total is: " + pizza2.price());
        System.out.println("pizza3 total is: " + pizza3.price());
        System.out.println("pizza4 total is: " + pizza4.price());
        double grandTotal = pizza1.price() + pizza2.price() + pizza3.price() + pizza4.price();

        System.out.println("Your grand total comes to: " + grandTotal);

    }
}
