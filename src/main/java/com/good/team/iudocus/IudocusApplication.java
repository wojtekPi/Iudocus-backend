package com.good.team.iudocus;

import com.good.team.iudocus.csv.CSVData;
import com.good.team.iudocus.csv.CSVReader;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class IudocusApplication {

	public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext context = SpringApplication.run(IudocusApplication.class, args);

        CSVReader csvReader = context.getBean(CSVReader.class);
        csvReader.read();
	}
}
