package pers.wxp.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaopeng
 * @date 2021年05月25日 13:38
 * @description
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("Male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
