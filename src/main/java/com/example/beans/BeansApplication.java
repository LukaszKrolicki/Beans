package com.example.beans;

import com.example.beans.services.ColourPrinter;
import com.example.beans.services.Impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class BeansApplication implements CommandLineRunner {

    private  ColourPrinter colourPrinter;


    public BeansApplication(ColourPrinter colourPrinter) {
        this.colourPrinter = colourPrinter;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeansApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("Printing colours: {}"+colourPrinter.print());

    }
}
