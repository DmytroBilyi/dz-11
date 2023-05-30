package Tests;

import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {

    @Parameters({"param1"})
    @Test(groups = {"Smoke"})
    public void testManName(String param1) {
        Man man = new Man("Dmytro", "Bilyi", 63);
        Assert.assertEquals(man.getFirstName(), param1, "Невірне ім'я");
    }
    @Parameters({"param4"})
    @Test(groups = {"Smoke"})
    public void testWomanName(String param4) {
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(woman.getFirstName(), param4, "Невірне ім'я");
    }
    @Parameters({"param6"})
    @Test(groups = {"Smoke"})
    public void testWomanAge(int param6) {
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(woman.getAge(), param6, "Невірний вік");
    }
    @Parameters({"param3"})
    @Test(groups = {"Smoke"})
    public void testManAge(int param3) {
        Man man = new Man("Dmytro", "Bilyi", 63);
        Assert.assertEquals(man.getAge(), param3, "Невірний вік");
    }
    @Parameters({"param2"})
    @Test(groups = {"Smoke"})
    public void testManLastName(String param2) {
        Man man = new Man("Dmytro", "Bilyi", 63);
        Assert.assertEquals(man.getLastName(), param2, "Невірне прізвище");
    }
    @Parameters({"param5"})
    @Test(groups = {"Smoke"})
    public void testWomanLastName(String param5) {
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(woman.getLastName(), param5, "Невірне прізвище");
    }
    @Parameters({"param7"})
    @Test(groups = {"Smoke"})
    public void testWomanMaidenName(String param7) {
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(woman.getMaidenName(), param7, "Невірне прізвище");
    }
    @Test(groups = {"Smoke"})
    public void testWomanPartner() {
        Man man = new Man("Dmytro", "Bilyi", 63);
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(woman.setPartner(man), man, "Партнер невірний");
    }
    @Test(groups = {"Smoke"})
    public void testManPartner() {
        Man man = new Man("Dmytro", "Bilyi", 63);
        Woman woman = new Woman("Olha", "Bilozerova", 61, "Bilozerova");
        Assert.assertEquals(man.setPartner(woman), woman,"Партнер невірний");
    }


}
