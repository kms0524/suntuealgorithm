package Java.Self.BOJ10809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static BufferedReader bufferedReader;
    static BufferedWriter bufferedWriter;

    static int alphabet[];
    static int count;
    static char s[];
    static ArrayList<Character> duplicate;
    static String answer;


    public static void main(String[] args) throws IOException {

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        answer = "";
        count = 0;
        alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        s = bufferedReader.readLine().toCharArray();
        duplicate = new ArrayList<>();

        for (int i = 0; i < s.length; i++){
            if (!duplicate.contains(s[i])){
                alphabet[s[i] - 97] = count;
                count++;
                duplicate.add(s[i]);
            }
            else {
                count++;
                continue;
            }
        }

        for (int i = 0; i < alphabet.length -1; i++){
            answer += alphabet[i] + " ";
        }
        answer += alphabet[alphabet.length -1];

        bufferedWriter.write(answer);
        bufferedWriter.flush();
    }
}
