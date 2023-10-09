package nl.bioinf.nomi.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestExceptions {
    public static void main(String[] args) {
        TestExceptions ex = new TestExceptions();
        ex.start();
    }

    void start() {
        try {
            openFile();
            writeFile();
            doCalculations();
        } catch (IOException e) {
            //LOGGEN
            //Error message to user
            //e.getMessage();
            e.printStackTrace();
        } catch (RuntimeException ex) {
            System.err.println("some calculation error");
        }
    }

    private void doCalculations() {
        List<Integer> numbers = List.of(2, 4, 1, 0, 5);
        for (int i=0; i<=numbers.size(); i++ ){
            System.out.println("divide " + numbers.get(i) + ": " + 0.0/numbers.get(i));
        }
    }

    private void writeFile() throws IOException{
        //
    }

    private void openFile() {
        String name = "/Users/michielnoback/Desktop/Datasets/occupancy.csv";
        Path dataPath = Paths.get(name);
        try(BufferedReader reader = Files.newBufferedReader(dataPath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("line = " + line);
            }
        } catch (IOException e) {
            throw new RuntimeException("file reading error: " + e.getMessage());
//            e.printStackTrace();
        }
    }
}
