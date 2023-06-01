package utils;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import dataproviders.TestDataProviderNumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {
    public static List<TestDataProviderNumbers> getData() {
        try {
        BufferedReader reader =  Files.newBufferedReader(Paths.get("src/test/resources/data.csv"));
            CsvToBean<TestDataProviderNumbers> csvReader =  new CsvToBeanBuilder<TestDataProviderNumbers>(reader)
                .withType(TestDataProviderNumbers.class)
                .build();
            return csvReader.parse();
    } catch(IOException ex){
            throw new RuntimeException("The file could not be found");
        }
    }
}
