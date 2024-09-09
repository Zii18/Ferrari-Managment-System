public class FerrariCars {
    private String car;
    private String model;
    private int kms;
    private String color;

    // Constructor
    public FerrariCars(String car, String model, int kms, String color) {
        this.car = car;
        this.model = model;
        this.kms = kms;
        this.color = color;
    }

    // Getters and Setters
    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FerrariCars{" +
                "car='" + car + '\'' +
                ", model='" + model + '\'' +
                ", kms=" + kms +
                ", color='" + color + '\'' +
                '}';
    }
}