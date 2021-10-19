package pers.wxp.type.finalTest;

/**
 * @author xiaopeng
 * @date 2021年09月22日 11:28
 * @description
 */
public class FinalExample extends FinalExampleParent {
    //在声明final实例成员变量时进行赋值
    private final static Person person = new Person(24, 170);

    public static void main(String[] args) {
        //对final引用数据类型person进行更改（引用不变，值可以变）
        person.age = 22;
        // 而对于引用类型变量而言，它仅仅保存的是一个引用，
        // final只保证这个引用类型变量所引用的地址不会发生改变，
        // 即一直引用这个对象，但这个对象属性是可以改变的。
        System.out.println(person.toString());
    }

    /**
     * 重载
     * @param str
     */
    public final void test(String str) {
    }

    static class Person {
        private int age;
        private int height;

        public Person(int age, int height) {
            this.age = age;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", height=" + height +
                    '}';
        }
    }
}
