package Tests;
import dataproviders.TestDataProvider;
import org.example.Man;
import org.example.Person;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
    @Test(dataProvider = "numbers", dataProviderClass = TestDataProvider.class)
    public void testManRegisterPartnership(String name1, String lastname1, int age1) {
        Man man = new Man(name1, lastname1, age1);
        Woman woman = new Woman(name1, lastname1, age1, "Bilozerova");
        Assert.assertEquals(woman.registerPartnership(man),lastname1, "Прізвище після реєстрації браку у жінки " + man.registerPartnership(woman));
    }
    @Test(dataProvider = "numbers", dataProviderClass = TestDataProvider.class)
    public void testWomanRegisterPartnership(String name1, String lastname1, int age1) {
        Man man = new Man(name1, lastname1, age1);
        Woman woman = new Woman(name1, lastname1, age1, "Bilozerova");
        Assert.assertEquals(man.registerPartnership(woman),lastname1, "Прізвище після реєстрації браку у жінки " + man.registerPartnership(woman));
    }
    @Test(dataProvider = "numbers", dataProviderClass = TestDataProvider.class)
    public void testDeregisterPartnership(String name1, String lastname1, int age1) {
        Woman woman = new Woman(name1, lastname1, age1, "Bilozerova");
        Assert.assertEquals(woman.deregisterPartnership(true), true, "Данні жінки після розлучення - " + woman.toString());
    }
    @Test(dataProvider = "numbers", dataProviderClass = TestDataProvider.class)
    public void testManIsRetired(String name1, String lastname1, int age1) {
        Man man = new Man(name1, lastname1, age1);
        Assert.assertEquals(man.isRetired(), false, "Вік у чоловіка більший пенсійного порогу!");
    }
    @Test
    public void testWomanIsRetired() {
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(woman.isRetired(), true, "Вік у жінки більший пенсійного порогу!");
    }



}
