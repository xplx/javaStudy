package pers.wxp.pattern.iterator;

/**
 * @author xiaopeng
 * @date 2021年05月27日 9:23
 * @description
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}

