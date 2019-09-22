import java.io.*;
import java.util.ArrayList;

/**
 * @author epochong
 * @date 2019/9/6 21:11
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class problem_01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        ArrayList<String> arrayList = new ArrayList <>();
        while ((line=bufferedReader.readLine())!=null) {
            arrayList.add(line);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            String s1 = new StringBuilder(s).reverse().toString();
            if (arrayList.contains(s1)) {
                System.out.println(s + " " + s1);
            }
        }
    }

}
