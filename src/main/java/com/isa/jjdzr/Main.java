package com.isa.jjdzr;

import com.isa.jjdzr.console.ConsoleOutputImpl;
import com.isa.jjdzr.service.DataFilteringService;

public class Main {

        public static void main(String[] args) {
                App app = new App(new DataFilteringService(), new ConsoleOutputImpl());
                app.runApp();
        }
}