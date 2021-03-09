package aggregation.Travel;

import java.math.BigDecimal;

//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class Tour {
    private String name;
    private VoucherType voucherType;
    private TransportType transportType;
    private FoodType foodType;
    private int duration;
    private BigDecimal cost;

    public Tour(String name, VoucherType voucherType, TransportType transportType, FoodType foodType, int duration, BigDecimal cost) {
        this.name = name;
        this.voucherType = voucherType;
        this.transportType = transportType;
        this.foodType = foodType;
        this.duration = duration;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\tvoucherType: " + voucherType +
                "\ttransportType: " + transportType +
                "\tfoodType: " + foodType +
                "\tduration: " + duration +
                "\tcost: " + cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VoucherType getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(VoucherType voucherType) {
        this.voucherType = voucherType;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}

enum VoucherType {

    RECREATION,
    TOUR,
    TREATMENT,
    SHOPPING,
    CRUISE,
    SPORT
}

enum TransportType {
    BUS,
    TRAIN,
    AIRPLANE,
    SHIP
}

enum FoodType {
    ROOM_ONLY,
    BED_AND_BREAKFAST,
    HALF_BOARD,
    FULL_BOARD,
    ALL_INCLUSIVE,
    ALL_INCLUSIVE_PREMIUM,
    ULTRA_ALL_INCLUSIVE
}
