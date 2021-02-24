package task9;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int year;
    private int numberOfPages;
    private double cost;
    private String typeOfBinding;

    public Book(int id, String title, String author, String publishingHouse, int year, int numberOfPages, double cost, String typeOfBinding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.cost = cost;
        this.typeOfBinding = typeOfBinding;
    }

    public boolean correctAuthor(String authorName){
        return this.author == authorName;
    }

    public boolean correctPublishingHouse(String publishingHouseName){
        return this.publishingHouse == publishingHouseName;
    }

    public boolean correctYear(int beginYear){
        return this.year > beginYear;
    }

    @Override
    public String toString() {
        return id +
                ", " + title +
                ", " + author +
                ", " + publishingHouse +
                ", " + year +
                ", " + numberOfPages +
                ", " + cost +
                ", " + typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }
}
