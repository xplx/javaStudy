package pers.wxp.pattern.adapter;

/**
 * @author xiaopeng
 * @date 2021年05月24日 10:26
 * @description
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
