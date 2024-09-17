package com.pengbo.kafkabatch.reader;

import com.pengbo.kafkabatch.Boot1;
import org.dflib.DataFrame;

import java.io.*;
import java.nio.file.Path;

public class BatchReader {

    private int currRow = 0;

    private int skip = 5;

    private String path = getClass().getClassLoader().getResource("origin.csv").getPath();

    public void readNext5Line() throws FileNotFoundException {
        DataFrame df = DataFrame.empty("id", "name", "tag", "age", "gender", "birthday");
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            for (int i = 0; i < skip; i++) {
                line = br.readLine();
                if (line == null) {
                    // 如果已经到达文件末尾，则退出循环
                    break;
                }
                df.addRow(line)
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

}
