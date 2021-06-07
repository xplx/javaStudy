package pers.wxp.pattern.template;

/**
 * @author xiaopeng
 * @date 2021年05月21日 13:37
 * @description
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
