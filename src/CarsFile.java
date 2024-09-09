import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

public class CarsFile {

    public static void addCarToCsv(String filePath, FerrariCars car) {
        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(car.getCar() + "," + car.getModel() + "," + car.getKms() + "," + car.getColor() + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String csvFile = "/Users/ZiadDawood/Desktop/FMS Data.csv";
        String line;
        String cvsSplitBy = ",";
        List<FerrariCars> carsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                if (values.length >= 4) {
                    String car = values[0];
                    String model = values[1];
                    int kms = Integer.parseInt(values[2]);
                    String color = values[3];
                    FerrariCars carObj = new FerrariCars(car, model, kms, color);
                    carsList.add(carObj);
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }
            for (FerrariCars car : carsList) {
                System.out.println(car);
            }
        } catch (IOException e) {
            System.out.println("Please check the file");
        }
        FerrariCars newCar = new FerrariCars("Ferrari", "F8 Tributo", 5000, "Red");
        addCarToCsv(csvFile, newCar);
    }
}