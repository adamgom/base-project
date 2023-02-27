package com.isa.jjdzr.filters;

import com.isa.jjdzr.interfaces.Filtering;

// klasa implementuje interfejs Filtering, a więc musimy zaimplementować
// metody wskazane w tym interfejsie

public class MyOwnSimpleFiltering implements Filtering {

    @Override
    public int[] getByIdRange() {
        return new int[] {3,15};
    }
}
