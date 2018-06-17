package inputStream;

import inputString.JoinStrings;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteToFile {

    public static void write(String fileName) {


        try( Writer stream = new FileWriter(fileName)) {
            stream.write(JoinStrings.scann());

        } catch (IOException exeption){
            System.out.println(exeption);
        }

    }
}
