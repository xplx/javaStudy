package pers.wxp.pattern.template;

/**
 * @author xiaopeng
 * @date 2021年05月21日 13:36
 * @description
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
