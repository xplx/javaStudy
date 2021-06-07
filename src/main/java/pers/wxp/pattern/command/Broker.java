package pers.wxp.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaopeng
 * @date 2021年05月28日 9:41
 * @description
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}

