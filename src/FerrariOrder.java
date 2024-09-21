import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FerrariOrder implements CarOrder {
    private static final String CSV_FILE = "/Users/ZiadDawood/Desktop/FMS Data.csv";

    private String color;
    private String modelType;


    public FerrariOrder(String color, String modelType) {
        this.color = color;
        this.modelType = modelType;
    }

    @Override
    public void orderSpecialCar(String color, String modelType) {
        this.color = color;
        this.modelType = modelType;

        if (isValidFerrariModel(modelType)) {
            writeToCsv();
        } else {
            System.out.println("Invalid Ferrari model type.");
        }
    }

    private boolean isValidFerrariModel(String modelType) {
        String[] validModels = {"488", "F8", "Portofino", "SF90", "488 Pista", "Roma"};
        for (String model : validModels) {
            if (model.equalsIgnoreCase(modelType)) {
                return true;
            }
        }
        return false;
    }

    private void writeToCsv() {
        String orderDetails = color + "," + modelType;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
            writer.write(orderDetails);
            writer.newLine();
            System.out.println("Order saved: " + orderDetails);
        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }

    public String getColor() {
        return color;
    }

    public String getModelType() {
        return modelType;
    }

    @Override
    public String toString() {
        return "FerrariOrder{" +
                "color='" + color + '\'' +
                ", modelType='" + modelType + '\'' +
                '}';
    }

    /*public static void main(String[] args) {
        FerrariOrder order = new FerrariOrder("Red", "F8 Tributo");
        order.orderSpecialCar(order.getColor(), order.getModelType());
    }*/
}