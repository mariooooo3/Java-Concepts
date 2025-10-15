
package Design_patterns.Builder;

public class HouseMain {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Vaslui", 2, 4)
                .poolCount(1)
                .solarPansCount(2)
                .applaincesCount(5)
                .build();

        House house2 = new House.HouseBuilder("Iasi", 4, 12)
                .poolCount(1)
                .solarPansCount(3)
                .applaincesCount(0)
                .build();

        System.out.println(house);
        System.out.println(house2);
    }
}
