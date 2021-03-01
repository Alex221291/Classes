package aggregation.country;
//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class Country {
    private String name;
    private City capital;
    private Area[] areas;
    private long population;
    private float square;

    public Country(String name, City capital, Area[] areas, long population, float square) {
        this.name = name;
        this.capital = capital;
        this.areas = areas;
        this.population = population;
        this.square = square;
    }

    public void printCapital() {
        System.out.println("Capital: " + capital.getName());
    }

    public void printNumberOfAreas() {
        System.out.println("Number of areas: " + areas.length);
    }

    public void printSquare() {
        System.out.println("Square: " + square);
    }

    public void printCentersOfAreas() {
        System.out.print("Centers of areas: ");
        for (Area a : areas) {
            System.out.print(a.getAreaCenter().getName() + "  ");
        }
        System.out.println();
    }

    public void print() {
        System.out.println("Country: " + name);
        capital.getName();
        System.out.println("population: " + population);
        System.out.println("square: " + square);
        for (Area a : areas) {
            a.print();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Area[] getAreas() {
        return areas;
    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        this.square = square;
    }
}
class Area {
    private String areaName;
    private City areaCenter;
    District[] districts;
    private long population;
    private float square;

    public Area(String areaName, City areaCenter, District[] districts, long population, float square) {
        this.areaName = areaName;
        this.areaCenter = areaCenter;
        this.districts = districts;
        this.population = population;
        this.square = square;
    }
    public void print() {
        System.out.println("areaName: " + areaName);
        System.out.println("areaCenter: " + areaCenter);
        System.out.println("population: " + population);
        System.out.println("square: " + square);
        for (District d : districts) {
            d.print();
        }

    }
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public City getAreaCenter() {
        return areaCenter;
    }

    public void setAreaCenter(City areaCenter) {
        this.areaCenter = areaCenter;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        this.square = square;
    }
}

class District {
    private String districtName;
    private City districtCenter;
    private long population;
    private float square;

    public District(String districtName, City districtCenter, long population, float square) {
        this.districtName = districtName;
        this.districtCenter = districtCenter;
        this.population = population;
        this.square = square;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "districtName: " + districtName +
                "| districtCenter: " + districtCenter +
                "| population: " + population +
                "| square: " + square;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        this.square = square;
    }
}

class City {
    String name;
    private long population;
    private float square;

    public City(String name, long population, float square) {
        this.name = name;
        this.population = population;
        this.square = square;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return  name +
                "| population: " + population +
                "| square: " + square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        this.square = square;
    }
}
