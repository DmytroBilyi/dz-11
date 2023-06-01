package dataproviders;

import com.opencsv.bean.CsvBindByName;

public class TestDataProviderNumbers {
    @CsvBindByName(column = "name1")
    private String name1;
    @CsvBindByName(column = "lastname1")
    private String lastname1;
    @CsvBindByName(column = "age1")
    private int age1;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}
