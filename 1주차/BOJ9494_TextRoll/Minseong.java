package Java.Self.BOJ9494_3;

import java.io.*;

public class Main {

    static BufferedReader bufferedReader;
    static BufferedWriter bufferedWriter;

    static int N, idx, num;
    static String[] s;
    public static void main(String[] args) throws IOException {


        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){

            N = Integer.parseInt(bufferedReader.readLine());

            if (N == 0){
                break;
            }
            idx = 0;
            num = 0;
            s = new String[N];

            for (int i = 0; i < N; i++){
                s[i] = bufferedReader.readLine();
            }

            while (num < N){

                if (s[num].length() <= idx){
                    num++;
                }
                else if (s[num].charAt(idx) == ' '){
                    num++;
                }
                else {
                    idx++;
                }
            }

            bufferedWriter.write(String.valueOf(idx + 1) + "\n");

        }
        bufferedWriter.flush();
    }
}
