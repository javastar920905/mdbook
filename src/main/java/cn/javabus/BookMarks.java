package cn.javabus;

import cn.javabus.util.FileUtil;
import cn.javabus.util.RunProcess;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ouzhx on 2019/4/26.
 * <p>
 * 书签转换为 md 文档工具
 */
public class BookMarks {
    /***删除属性  ADD_DATE 以及 ICON**/
    static Pattern patternClass = Pattern.compile(" (ADD_DATE|ICON|LAST_MODIFIED)=\".*\"");
    static String path = BookMarks.class.getClassLoader().getResource("").getPath();
    static String root = path.substring(0, path.indexOf("mdbook/"));

    public static void main(String[] args) {
        //输出文件地址
        String outputFileName = root + "\\mdbook\\docs\\generate.md";
        System.out.println(outputFileName);

        //输入文件地址
        String bookmarksPath = root + "\\mdbook\\src\\main\\java\\cn\\javabus\\tempBookMarks.html";
        System.out.println(bookmarksPath);


        //第一个h3标签跳过标识
        boolean isFirstH3Over = false;
        StringBuilder sb = new StringBuilder();
        // 建立一个对象，它把文件内容转成计算机能读懂的语言
        try (FileReader reader = new FileReader(bookmarksPath); BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                line = line.replaceAll("<DT>", "").replaceAll("<DL>", "").replaceAll("</DL>", "").replaceAll("<p>", "");

                //删除属性  ADD_DATE 以及 ICON
                Matcher matcher = patternClass.matcher(line);
                if (matcher.find()) {
                    line = matcher.replaceAll("");
                }
                if (line.contains("<H3>")) {
                    line=line.replaceAll("<H3>", "* ").replaceAll("</H3>", "");
                    if (isFirstH3Over == false) {
                        isFirstH3Over = true;
                    } else {
                        line = "\r\n" + line;
                    }
                }

                if (line.contains("<A")) {
                    line = "   * " + line + "";
                }

                if (line != null && !line.equals("")) {
                    sb.append(line).append("\r\n");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String content = sb.toString();
        System.out.println(content);

        FileUtil.writeFile(outputFileName, content);
        //自动执行mvntest.bat,生成菜单栏
        String command = root + "mdbook\\mvntest.bat";
        RunProcess.doExec(command);


    }


}
