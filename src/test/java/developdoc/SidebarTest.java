package developdoc;

import cn.javabus.util.FileUtil;
import org.junit.Test;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;

/**
 * 生成_sidebar.md文件，直接运行即可
 *
 * @author tanghc
 */
public class SidebarTest {

    //支持二级目录,多级目录自动变成二级目录显示
    static String format = "   * [%s](%s/%s)\r\n";
    static String parent_format = "* %s \r\n";
    static String sidebar_format = "# 文档目录\r\n\r\n# [java 开发手册](README.md)\r\n%s";


    @Test
    public void generatorNav() {
        String path = SidebarTest.class.getClassLoader().getResource("").getPath();
//		System.out.println(path);
        String root = path.substring(0, path.indexOf("mdbook/"));
        String fileDir = root + "mdbook/docs/books";
        System.out.println("fileDir  " + fileDir);


        File dir = new File(fileDir);
        File[] files = dir.listFiles();
        StringBuilder output = new StringBuilder();
        String sidebarContent = String.format(sidebar_format, genSidebarContent(files, output));

        System.out.println(sidebarContent);

        String sidebarFilepath = root + "mdbook/docs/_sidebar.md";

        try {


            OutputStreamWriter oStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(sidebarFilepath)), "utf-8");
            oStreamWriter.append(sidebarContent);
            oStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //多级目录,递归创建侧边栏
    public String genSidebarContent(File[] files, StringBuilder output) {
        for (File file : files) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles.length > 0) {
                    String fileName = file.getName();
                    String leftNavName = fileName.contains("_")?fileName.substring(fileName.lastIndexOf("_") + 1):fileName;
                    output.append(String.format(parent_format, leftNavName));
                    genSidebarContent(listFiles, output);
                }
            } else {
                String filename = file.getName();
                String title = FileUtil.readFileFirstLine(file).replaceAll("#", "").replaceAll("<H3>", "").replaceAll("</H3>", "");//filename.substring(filename.indexOf("_") + 1, filename.length() - 3);
                String line = String.format(format, title, getAllParentDir(file), filename);
                output.append(line);
            }
        }

        return output.toString();
    }


    //获取相对于docs 的目录路径
    public String getAllParentDir(File file) {
        String path = file.getAbsolutePath();
        String name = file.getName();
        int docs = path.indexOf("docs") + 5;
        int end = path.indexOf(name) - 1;
        String parentDir = path.substring(docs, end);

        return parentDir.replace("\\", "/");
    }

    //获取文件的上一级目录
    public String getParentDir(File file) {
        String path = file.getAbsolutePath();
        String name = file.getName();
        path = path.substring(0, path.indexOf(name) - 1);
        String parentDir = path.substring(path.lastIndexOf("\\"));

        return parentDir.replace("\\", "");
    }

//	@Test
//	public void name() {
//		String path= "E:\\gitRepository\\mdbook\\docs\\books\\git\\github-init.md";
//		System.out.println(getParentDir(new File(path)));
//	}
}
