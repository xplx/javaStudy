package pers.wxp.pattern.visitor;

/**
 * @author xiaopeng
 * @date 2021年05月27日 9:28
 * @description
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        //访问接口，new构造方法
        ComputerPart computer = new Computer();
        //执行方法
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

