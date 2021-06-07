package pers.wxp.pattern.interpreter;

/**
 * @author xiaopeng
 * @date 2021年05月27日 11:16
 * @description
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }

        return false;
    }
}

