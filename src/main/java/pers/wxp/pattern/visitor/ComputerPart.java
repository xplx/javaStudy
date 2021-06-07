package pers.wxp.pattern.visitor;

/**
 * @author xiaopeng
 * @date 2021年05月27日 9:25
 * @description 接受操作的 ComputerPart 接口
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

