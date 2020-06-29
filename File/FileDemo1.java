package File;

//File类的一些常用API：
import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\学习书籍");
        File file1=new File("");
        file.isDirectory();   // 判断是否是目录
        file.isFile();    //判断是否是文件
        file.exists();   //判断该文件是否已经存在
        file.getName();  //得到文件名，不包含它的路径
        file.list();   //调用list()获取目录下的所有文件名，返回的是一个字符串数组
        file.createNewFile(); //创建新文件
        file.delete();   //删除文件
        file.isHidden(); //是否是隐藏文件
        file.canRead();  //是否可读
        file.canWrite(); //是否可写
        file.canExecute();//是否可执行
    }

}
