package dataproviders;

import org.testng.annotations.DataProvider;

import java.util.List;

import static utils.CsvReader.getData;
import static utils.DBReader.getNumbersFromDB;


public class TestDataProvider {
    @DataProvider(name = "numbers")
    public static Object[][] numbers() {
        List<TestDataProviderNumbers> numbers =  getData();
        Object[][] objects = new Object[numbers.size()][3];
        for(int i=0;i<numbers.size(); i++){
            objects[i][0] = numbers.get(i).getName1();
            objects[i][1] = numbers.get(i).getLastname1();
            objects[i][2] = numbers.get(i).getAge1();
        }
        //return objects;
        return getNumbersFromDB().stream().map(number -> new Object[]{number.getName1(), number.getLastname1(), number.getAge1()})
                .toArray(Object[][]::new);
    }
}
