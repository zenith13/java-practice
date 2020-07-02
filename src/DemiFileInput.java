import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemiFileInput {

    public  static void main(String args[]) throws IOException {
        System.out.println("File incoming through File REader");
        try {
            long startTime = System.nanoTime();




            FileReader f = new FileReader("/Users/paras_ibm/dumps/test.txt");
            File file = new File("/Users/paras_ibm/dumps/test.txt");
            InputStream targetStream = new FileInputStream(file);
            System.out.println("1111"+targetStream.toString());
            StringWriter writer = new StringWriter();
            java.util.Scanner s = new java.util.Scanner(targetStream).useDelimiter("\\A");
            System.out.println(s.next());
            String theString = writer.toString();
            List<String> result = new ArrayList<>();
                StringBuffer sb = new StringBuffer();
                while (f.ready()) {
                    char c = (char) f.read();
                    if (c == '\n') {
                        result.add(sb.toString());
                        sb = new StringBuffer();
                    } else {
                        sb.append(c);
                    }
                }
                if (sb.length() > 0) {
                    result.add(sb.toString());
                }
            System.out.println(result);
            long endTime   = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("FR"+totalTime);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long startTime1 = System.nanoTime();
        BufferedReader bf = new BufferedReader(new FileReader("/Users/paras_ibm/dumps/test.txt"));
        List<String> readLine = new ArrayList<>();
        while (bf.ready())
        {
            readLine.add(bf.readLine());
        }
        System.out.println(readLine);
        long endTime1   = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("BR"+totalTime1);

        //SCANNNER
        Scanner s = new Scanner(new FileReader("/Users/paras_ibm/dumps/test.txt"));
        List<String> readLine2 = new ArrayList<>();
        while (s.hasNext())
        {
            readLine2.add(s.nextLine());
        }
        System.out.println(readLine2);

        //FILES
        System.out.println(Files.readAllLines(Paths.get("/Users/paras_ibm/dumps/test.txt")));

        final File file = new File("./testFile/test.txt");
        final File file1 = new File("./testFile123");
        file1.mkdirs();
        System.out.println(file.exists());
    }
}
