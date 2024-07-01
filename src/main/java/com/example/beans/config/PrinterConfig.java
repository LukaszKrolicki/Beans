package com.example.beans.config;

import com.example.beans.services.BluePrinter;
import com.example.beans.services.ColourPrinter;
import com.example.beans.services.GreenPrinter;
import com.example.beans.services.Impl.*;
import com.example.beans.services.RedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter(){
        return new PolishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new PolishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new PolishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColourPrinterImpl(redPrinter,bluePrinter,greenPrinter);
    }
}
