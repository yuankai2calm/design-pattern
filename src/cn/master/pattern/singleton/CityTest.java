package cn.master.pattern.singleton;

public class CityTest {
    public static void main(String[] args) {
        City city1 = City.getInstance();
        System.out.println(city1);
        City city2 = City.getInstance();
        System.out.println(city2);
    }
}
