package structural.decorator;

public class GoldenCornDecorator extends PizzaDecorator {
    public GoldenCornDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", golden corn";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.25; // Cost of golden corn
    }
}