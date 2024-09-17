package com.pengbo.kafkabatch;

import org.dflib.DataFrame;
import org.dflib.csv.Csv;

public class Boot1 {

    public static void main(String[] args) {
        System.out.println(Boot1.class.getClassLoader().getResource("origin.csv").getPath());
        DataFrame df = Csv.load(Boot1.class.getClassLoader().getResource("origin.csv").getPath());
        System.out.println(df);
    }
}
