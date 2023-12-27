package H_Exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        
    }

    public static void createNewFile() {
        File file = new File("file\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created" + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
