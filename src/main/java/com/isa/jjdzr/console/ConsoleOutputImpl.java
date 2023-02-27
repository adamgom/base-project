package com.isa.jjdzr.console;

import com.isa.jjdzr.data.model.DataBean;
import java.util.List;

public class ConsoleOutputImpl implements ConsoleOutput {

    @Override
    public void displayBeans(List<DataBean> allData) {
        System.out.println("- All data beans");
        allData.forEach(System.out::println);
    }

    @Override
    public void displayPlaces(List<String> places) {
        System.out.println("- Places");
        for (int i = 0; i < places.size(); i++) {
            System.out.println(i + " - " + places.get(i));
        }
    }

    @Override
    public void displayResults(List<DataBean> result) {
        System.out.println("- results");
        result.forEach(System.out::println);
        System.out.println("result size:  " + result.size());
    }

    @Override
    public void printSeparator() {
        System.out.println("============");
    }
}
