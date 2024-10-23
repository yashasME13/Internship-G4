package Text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_text {
    public static void main(String[] args) {
        // Specify the file path where you want to write
        String filePath = "D:\\Intership\\TextFile.txt"; // Path for the new or existing file

        // The content you want to write to the file
        String content = "This is a sample text for the output file, the data is overridden everytime .";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content); // Write the content to the file
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace(); // Print any IO exceptions that occur
        }
    }

}
