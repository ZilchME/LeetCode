package edu.csu.acm.meituan2024.autumn1.one;

import java.io.*;
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    // 静态代码块中设置System.in
    static {
        try {
            FileInputStream fis = new FileInputStream("./src/main/java/edu/csu/acm/meituan2024/autumn1/one/input");
            System.setIn(fis);
        } catch (FileNotFoundException _) {
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter out = new PrintWriter(bw);
        String line;
        int n, k, x;
        for (int z = 0,total = Integer.parseInt(br.readLine()); z < total; z++) {
            String[] parts = br.readLine().split(" ");
            n = Integer.parseInt(parts[0]);
            k = Integer.parseInt(parts[1]);
            x = Integer.parseInt(parts[2]);
            int[] arr = new int[n];
            parts = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            int mex = getMinNum(arr);


            out.println(mex);
        }

        out.flush();
        out.close();
    }

    private static int getMinNum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[nums[i]] != nums[i] && nums[i] < n) {
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            }
        }
        for (int i = 0; i < n;i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }
}