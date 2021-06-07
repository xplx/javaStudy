package pers.wxp.pattern.visitor;

/**
 * @author xiaopeng
 * @date 2021年05月27日 9:26
 * @description
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

