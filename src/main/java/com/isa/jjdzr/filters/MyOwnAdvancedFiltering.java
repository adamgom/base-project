package com.isa.jjdzr.filters;

import com.isa.jjdzr.data.model.DataBean;
import com.isa.jjdzr.interfaces.AdvancedFiltering;
import java.util.function.Predicate;

// klasa implementuje interfejs AdvancedFiltering, a więc musimy zaimplementować
// metody wskazane w tym interfejsie

public class MyOwnAdvancedFiltering implements AdvancedFiltering {

    @Override
    public Predicate<DataBean> getByName() {
        return dataBean -> dataBean.getName().toLowerCase().startsWith("t");
    }

    @Override
    public Predicate<DataBean> getByPlace() {
        return dataBean -> dataBean.getPlace().equals("White Castle");
    }

    @Override
    public Predicate<DataBean> getActive() {
        return dataBean -> true;
    }

    @Override
    public int[] getByIdRange() {
        return new int[] {2,14};
    }
}
