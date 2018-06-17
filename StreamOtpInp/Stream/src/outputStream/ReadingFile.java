package outputStream;

import java.io.*;

public class ReadingFile {

    public static void read(String fileName) {

        try( Reader stream = new FileReader(fileName)) {
            int data;

            while ((data = stream.read()) != -1){
                System.out.println((char) data + " ");
            }

        } catch (IOException exeption){
            System.out.println(exeption);
        }

    }
}
