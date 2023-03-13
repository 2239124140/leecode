package com.founder.leecode.leecode.$202211.$20221105;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $3partition {
    static  boolean[][] f;
    static  List<List<String>> ret = new ArrayList<List<String>>();
    static List<String> ans = new ArrayList<String>();
    static int n;


    public static List<List<String>> partition(String s) {
        n = s.length();
        f = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(f[i], true);
        }

        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                f[i][j] = (s.charAt(i) == s.charAt(j)) && f[i + 1][j - 1];
            }
        }

        //dfs(s, 0);
        return ret;
    }


    public static void main(String[] args) {
         String s = "aab";
        partition(s);


    }
}
