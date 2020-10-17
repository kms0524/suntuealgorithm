package Java.Self.BOJ11721;

import java.io.*;

public class Main {

    static BufferedReader bufferedReader;
    static BufferedWriter bufferedWriter;

    static String s;

    public static void main(String[] args) throws IOException {

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        s = bufferedReader.readLine();

        for (int i = 0; i < s.length(); i++){

            bufferedWriter.write(s.charAt(i));

            if (i % 10 == 9){
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.flush();
    }

}
