package task4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    public void writeFile(String path, String line) {
        try {
            FileWriter write = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(write);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
