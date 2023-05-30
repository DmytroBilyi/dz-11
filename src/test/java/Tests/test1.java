package Tests;
import org.example.Man;
import org.example.Person;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
    @Test
    public void testManRegisterPartnership() {
        Man man = new Man("Dmytro", "Bilyi", 63);
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(woman.registerPartnership(man),"Bilyi", "Прізвище після реєстрації браку у жінки " + man.registerPartnership(woman));
    }
    @Test
    public void testWomanRegisterPartnership() {
        Man man = new Man("Dmytro", "Bilyi", 63);
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(man.registerPartnership(woman),"Bilyi", "Прізвище після реєстрації браку у жінки " + man.registerPartnership(woman));
    }
    @Test
    public void testDeregisterPartnership() {
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(woman.deregisterPartnership(true), true, "Данні жінки після розлучення - " + woman.toString());
    }
    @Test
    public void testManIsRetired() {
        Man man = new Man("Dmytro", "Bilyi", 63);
        Assert.assertEquals(man.isRetired(), false, "Вік у чоловіка більший пенсійного порогу!");
    }
    @Test
    public void testWomanIsRetired() {
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(woman.isRetired(), true, "Вік у жінки більший пенсійного порогу!");
    }



}
