package pers.wxp.pattern.template;

/**
 * @author xiaopeng
 * @date 2021年05月21日 13:38
 * @description
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }
}
