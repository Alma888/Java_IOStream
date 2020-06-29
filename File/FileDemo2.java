package File;
//操作目录和文件 示例程序
import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) {
        File file1=new File("D:\\学习书籍");
        if(!file1.exists()){
            //如果当前文件不存在，就在当前路径下创建该文件
            try {
                file1.createNewFile();//注意，需要处理异常
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        File dir=new File("D:\\代码");  //创建 dir 目录对象
        if(dir.isDirectory()){
            String[] files=dir.list();    //调用list方法获取它的所有文件
            for(String fileName:files){  //遍历文件
                //用目录和文件名生成File 对象
                File f=new File(dir.getPath()+File.separator+fileName);
                //进行分类打印
                if(f.isFile()){
                    System.out.println("file:"+f.getName());
                }else if(f.isDirectory()){
                    System.out.println("dir:"+f.getName());
                }
            }
        }
    }
}
