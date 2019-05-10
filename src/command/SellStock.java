package command;

/**
 * This implementation of the Command interface contains an instance of the
 * receiver. At runtime, the Invoker will call its execute() method.
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }

    @Override
    public void undo() {
        abcStock.buy();
    }
    
}
