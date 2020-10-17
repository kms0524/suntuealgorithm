package Java.Self.BOJ1316;

import java.io.*;
import java.util.ArrayList;

public class Main {

    static BufferedReader bufferedReader;
    static BufferedWriter bufferedWriter;

    static ArrayList<Character> arrayList;

    static String string;
    static int N,count;
    static char standard;
    static boolean flag;


    public static void main(String[] args) throws IOException {

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(bufferedReader.readLine());
        count = 0;

        for (int i = 0; i < N; i++){

            flag = true;

            arrayList = new ArrayList<>();
            string = bufferedReader.readLine();

            if (string.length() == 1){
                count++;
            }
            else {
                standard = string.charAt(0);
                arrayList.add(standard);

                for (int j = 1; j < string.length(); j++){

                    if (string.charAt(j) == standard){
                        continue;
                    }
                    else {

                        if (!arrayList.contains(string.charAt(j))){
                            standard = string.charAt(j);
                            arrayList.add(standard);
                        }

                        else {
                            flag = false;
                            break;
                        }
                    }

                }
                if (flag == true){
                    count++;
                }
            }
        }
        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.flush();
    }
}
