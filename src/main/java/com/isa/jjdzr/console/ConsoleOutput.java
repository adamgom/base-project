package com.isa.jjdzr.console;

import com.isa.jjdzr.data.model.DataBean;
import java.util.List;

public interface ConsoleOutput {
    void displayBeans(List<DataBean> allData);
    void displayPlaces(List<String> places);
    void displayResults(List<DataBean> result);
    void printSeparator();
}
