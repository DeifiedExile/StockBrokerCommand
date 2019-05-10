package command;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the Invoker: it executes the Commands.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();
    private List<Order> orderHistory = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
            orderHistory.add(order);
        }
        orderList.clear();
    }
    
    public void undoOrders()
    {
        if(!orderHistory.isEmpty())
        {
            orderHistory.remove(orderHistory.size()-1).undo();
        }
    }
}
