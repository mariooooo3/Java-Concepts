package Design_patterns.Builder;

public class House {
    private String location;
    private int floor;
    private int room;
    private int poolCount;
    private int solarPansCount;
    private int appliancesCount;

    public House(String location, int floor, int room, int poolCount,
                 int solarPansCount, int appliancesCount) {
        this.location = location;
        this.floor = floor;
        this.room = room;
        this.poolCount = poolCount;
        this.solarPansCount = solarPansCount;
        this.appliancesCount = appliancesCount;
    }

    public String toString() {
        return ("Casa este localizata in " + location + " cu " + floor +
                " estaje si " + room + " camere");
    }

    public static class HouseBuilder {
        private String location;
        private int floor;
        private int room;
        private int poolCount = 0;
        private int solarPansCount = 0;
        private int appliancesCount = 0;

        public HouseBuilder(String location, int floor, int room) {
            this.location = location;
            this.floor = floor;
            this.room = room;
        }


        public HouseBuilder poolCount(int poolCount) {
            this.poolCount = poolCount;
            return this;
        }

        public HouseBuilder solarPansCount(int solarPansCount) {
            this.solarPansCount = solarPansCount;
            return this;
        }

        public HouseBuilder applaincesCount(int appliancesCount) {
            this.appliancesCount = appliancesCount;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }

    private House(HouseBuilder builder) {
        this.location = builder.location;
        this.floor = builder.floor;
        this.room = builder.room;
        this.poolCount = builder.poolCount;
        this.solarPansCount = builder.solarPansCount;
        this.appliancesCount = builder.appliancesCount;

    }

}
