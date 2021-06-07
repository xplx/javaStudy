package pers.wxp.pattern.command;

/**
 * @author xiaopeng
 * @date 2021年05月28日 9:41
 * @description
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }


    @Override
    public void execute() {
        abcStock.buy();
    }
}

