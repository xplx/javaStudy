package pers.wxp.pattern.command;

/**
 * @author xiaopeng
 * @date 2021年05月28日 9:41
 * @description
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

}

