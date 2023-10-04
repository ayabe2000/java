import java.io.FileWriter;
import java.io.IOException;

public class SampleMathToCSV {
    public static void main(String[] args) {
        String fileName = "output.csv";

        try (FileWriter writer = new FileWriter(fileName)) {

            writer.append("angle in degree,cos,sin\n");

            for (int angleInDegree = 0; angleInDegree < 360; angleInDegree += 10) {
                double angleInRadian = Math.PI * angleInDegree / 180;
                writer.append(angleInDegree + "," + Math.cos(angleInRadian) + "," + Math.sin(angleInRadian) + "\n");
            }

            System.out.println("Data exported to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
