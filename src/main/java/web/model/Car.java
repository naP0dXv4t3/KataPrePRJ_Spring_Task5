package web.model;

public class Car {
    private String brand;
    private String model;
    private String date;
    public Car(){

    }

    public Car(String brand, String model, String date) {
        this.brand = brand;
        this.model = model;
        this.date = date;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
