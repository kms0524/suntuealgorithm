package Java.Self.BOJ1920;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, M, checkNum, result;
    static int A[];

    static BufferedReader bufferedReader;
    static BufferedWriter bufferedWriter;
    static StringTokenizer stringTokenizer;

    public static void main(String[] args) throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(A);

        M = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < M; i++) {
            checkNum = Integer.parseInt(stringTokenizer.nextToken());
            result = sol(A, checkNum);
            bufferedWriter.write(String.valueOf(result + "\n"));
        }
        bufferedWriter.flush();
    }

    public static int sol(int[] A, int n) {
        int first = 0;
        int last = A.length - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2;

            if (n == A[mid])
                return 1;
            else {
                if (n < A[mid])
                    last = mid - 1;
                else
                    first = mid + 1;
            }
        }
        return 0;
    }
}
