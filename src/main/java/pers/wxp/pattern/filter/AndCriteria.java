package pers.wxp.pattern.filter;

import java.util.List;

/**
 * @author xiaopeng
 * @date 2021年05月25日 13:41
 * @description
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> list = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(list);
    }
}
