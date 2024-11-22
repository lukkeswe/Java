import java.io.*;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/jln97/OneDrive/ドキュメント/Java/24-11-15/test.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 5; i++) {
                bw.write("[" + i + "]");
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
