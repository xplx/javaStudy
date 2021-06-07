package pers.wxp.pattern.template;

/**
 * @author xiaopeng
 * @date 2021年05月21日 13:35
 * @description
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {
        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
