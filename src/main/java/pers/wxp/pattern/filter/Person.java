package pers.wxp.pattern.filter;

/**
 * @author xiaopeng
 * @date 2021年05月25日 13:36
 * @description
 */
public class Person {
    private String name;

    private String gender;

    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
