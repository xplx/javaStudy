package pers.wxp.pattern.mediator;

import java.util.Date;

/**
 * @author xiaopeng
 * @date 2021年05月31日 13:43
 * @description
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }

}

