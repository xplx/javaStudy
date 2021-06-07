package pers.wxp.pattern.command;

/**
 * @author xiaopeng
 * @date 2021年05月28日 9:42
 * @description
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}

