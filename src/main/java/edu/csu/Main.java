package edu.csu;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter out = new PrintWriter(bw);
        String line;
        int a, b;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
            out.println(a + b);
        }
        out.flush();
        out.close();
        bw.close();
    }
}