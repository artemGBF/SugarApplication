package ru.gbf.sugar.sugar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SugarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SugarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Приветсую!");
        System.out.println(12345);
    }
}
