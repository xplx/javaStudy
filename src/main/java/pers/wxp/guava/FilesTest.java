package pers.wxp.guava;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @author xiaopeng
 * @date 2021年07月13日 15:43
 * @description
 */
public class FilesTest {
    public static void main(String[] args) throws IOException {
        File newFile = new File("D:/text.txt");
        Files.write("this is a test".getBytes(), newFile);
        //再次写入会把之前的内容冲掉
        Files.write("csc".getBytes(), newFile);
        //追加写
        Files.append("lwl", newFile, Charset.defaultCharset());


        File newFile1 = new File("D:/text.txt");
        List<String> lines = Files.readLines(newFile1, Charset.defaultCharset());
        System.out.println(lines);
    }
}
