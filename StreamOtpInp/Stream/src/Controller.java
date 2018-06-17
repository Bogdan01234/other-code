import inputStream.WriteToFile;
import inputString.UserInout;
import outputStream.ReadingFile;

class Controller {

    public static void main(String[] args){

        String file = UserInout.scann("Enter the name of the file ");

        String fileName = "C:\\Users\\Богдан\\project\\StreamOtpInp\\" + file + ".txt";

        WriteToFile.write(fileName);

        ReadingFile.read(fileName);

    }
}
