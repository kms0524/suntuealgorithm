package Java.Self.BOJ10872;

import java.io.*;

public class Main {

    static BufferedReader bufferedReader;
    static BufferedWriter bufferedWriter;

    static int N, answer;

    public static void main(String[] args) throws IOException {

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(bufferedReader.readLine());

        answer = fact(N);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.flush();

    }

    public static int fact(int N){

        if (N <= 1){
            return 1;
        }
        return N * fact(N - 1);
    }
}
