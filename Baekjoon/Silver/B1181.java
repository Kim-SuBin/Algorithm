package Baekjoon.Silver;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class B1181 { // 단어 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();

                if (result == 0) {
                    result = o1.compareTo(o2);
                }

                return result;
            }
        });

        bw.write(words[0] + "\n");
        for (int i = 1; i < N; i++){
            if (!words[i].equals(words[i-1])) {
                bw.write(words[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
