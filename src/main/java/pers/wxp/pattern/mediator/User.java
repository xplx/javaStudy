package pers.wxp.pattern.mediator;

/**
 * @author xiaopeng
 * @date 2021年05月31日 13:45
 * @description
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}

