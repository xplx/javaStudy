package pers.wxp.pattern.visitor;

/**
 * @author xiaopeng
 * @date 2021年05月27日 9:27
 * @description 访问者类的操作
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}

