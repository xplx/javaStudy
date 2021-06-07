package pers.wxp.pattern.adapter;

/**
 * @author xiaopeng
 * @date 2021年05月24日 10:26
 * @description
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 什么也不做
    }
}
