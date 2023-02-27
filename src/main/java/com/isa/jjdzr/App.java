package com.isa.jjdzr;

import com.isa.jjdzr.console.ConsoleOutput;
import com.isa.jjdzr.data.model.DataBean;
import com.isa.jjdzr.filters.MyOwnAdvancedFiltering;
import com.isa.jjdzr.filters.MyOwnSimpleFiltering;
import com.isa.jjdzr.interfaces.AdvancedFiltering;
import com.isa.jjdzr.interfaces.Filtering;
import com.isa.jjdzr.service.DataFiltering;
import java.util.List;

public class App {

    private DataFiltering dataFiltering;
    private ConsoleOutput consoleOutput;

    public App(DataFiltering dataFiltering, ConsoleOutput consoleOutput) {
        this.dataFiltering = dataFiltering;
        this.consoleOutput = consoleOutput;
    }

    public void runApp() {
        printInitialData();

        // utworzenie instancji dwóch klas implementujących Filtering oraz AdvancedFiltering
        Filtering filtering = new MyOwnSimpleFiltering();
        AdvancedFiltering advancedFiltering = new MyOwnAdvancedFiltering();

        // wywołanie metody w zewnętrznym servisie podając jako argument dowolny obiekt zbudowany
        // na bazie dowolnej klasy, o ile klasa ta implementuje Filtering lub AdvancedFiltering
        List<DataBean> result = dataFiltering.getDataBeans(advancedFiltering);

        consoleOutput.displayResults(result);
    }

    private void printInitialData() {
        List<String> places = dataFiltering.getAllPlaces();
        List<DataBean> allBeans = dataFiltering.getAllDataBeans();
        consoleOutput.printSeparator();
        consoleOutput.displayBeans(allBeans);
        consoleOutput.printSeparator();
        consoleOutput.displayPlaces(places);
        consoleOutput.printSeparator();
    }
}
