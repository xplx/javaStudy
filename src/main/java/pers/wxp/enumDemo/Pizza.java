package pers.wxp.enumDemo;

import java.util.EnumSet;
import java.util.stream.Collectors;

/**
 * @author xiaopeng
 * @date 2021年07月07日 9:20
 * @description
 */
public class Pizza {
    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    private PizzaStatus status;
    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED;
    }

    public boolean isDeliverable() {
        return getStatus() == PizzaStatus.READY;
    }

    public static void main(String[] args) {
        Integer i1 = 40;
        Integer i2 = new Integer(40);
        System.out.println(i1==i2);//false
        System.out.println(i1.equals(i2));
    }
}
