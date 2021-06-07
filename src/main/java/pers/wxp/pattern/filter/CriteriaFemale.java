package pers.wxp.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaopeng
 * @date 2021年05月25日 13:39
 * @description
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
