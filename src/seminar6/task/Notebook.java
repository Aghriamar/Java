package seminar6.task;

import java.util.Objects;

public class Notebook {
    private String brand;
    private String model;
    private String color;
    private String price;

    public Notebook(String brand, String model, String color, String price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(brand, notebook.brand) &&
                Objects.equals(model, notebook.model) &&
                Objects.equals(color, notebook.color) &&
                Objects.equals(price, notebook.price);
    }

    public Object getFieldValue(int fieldNum) {
        switch (fieldNum) {
            case 1:
                return brand;
            case 2:
                return model;
            case 3:
                return color;
            case 4:
                return price;
            default:
                throw new IllegalArgumentException("Invalid field number: " + fieldNum);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, price);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
