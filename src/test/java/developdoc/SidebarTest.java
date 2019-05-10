package developdoc;

import cn.javabus.util.FileUtil;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
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
    static String sidebar_format = "# [java 开发手册](README.md)\r\n%s\r\n* <a href=\"timeline.html\" target=\"_blank\">timeline</a>";
    static String[] emojis={"🔞","🆚","💖","☠","🔧","😘"};


    @Test
    public void generatorNav() {
        String path = SidebarTest.class.getClassLoader().getResource("").getPath();
		System.out.println(path);//linux 输出 /home/coding/workspace/target/test-classes/
       
        String projectDir;
        if(System.getProperty("os.name").toLowerCase().contains("linux")&&path.contains("workspace/")){
            // 解决cloud studio 项目名为workspace/问题
            projectDir="workspace/";
        }else {
            projectDir="mdbook/";
           
        }
       String root = path.substring(0, path.indexOf(projectDir));
       String fileDir = root +projectDir+ "docs/books";
        System.out.println("fileDir  " + fileDir);


        File dir = new File(fileDir);
        File[] files = dir.listFiles();
        Arrays.sort(files,Comparator.comparing(f->f.getName()) );
        StringBuilder output = new StringBuilder();
        String sidebarContent = String.format(sidebar_format, genSidebarContent(files, output));

        System.out.println(sidebarContent);

        String sidebarFilepath =  root +projectDir+"docs/_sidebar.md";

        try {


            OutputStreamWriter oStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(sidebarFilepath)), "utf-8");
            oStreamWriter.append(sidebarContent);
            oStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int index=0;
    //多级目录,递归创建侧边栏
    public String genSidebarContent(File[] files, StringBuilder output) {
        Arrays.sort(files,Comparator.comparing(f->f.getName()) );
        for (File file : files) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles.length > 0) {
                    String fileName = file.getName();
                    String leftNavName = fileName.contains("_")?fileName.substring(fileName.lastIndexOf("_") + 1):fileName;
                        
                    if(index<emojis.length){
                        leftNavName=leftNavName+emojis[index];
                        index++;
                    }
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
