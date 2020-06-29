package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//写一个复制文件的程序（将一个文件的内容写入另一个文件中）
public class FileDemo3 {
    public static void main(String[] args) throws Exception {
        //生成输入文件的输入流对象
        FileInputStream fin=new FileInputStream("D:\\a.txt");
        //生成输出文件的输出流对象
        FileOutputStream fout=new FileOutputStream("D:\\b.txt");
        //定义一个永固暂存数据的 byte 数组
        byte[] buff=new byte[256];
        //每次读取数据的长度
        int len=0;
        //循环读取到 buff中，如果文件到底，则读取数据的长度小于0
        while ((len=fin.read(buff))>0){
            fout.write(buff,0,len);//把数据一次写进输出文件中
        }
        fin.close();//关闭输入流
        fout.close();//关闭输出流
    }
}

//设计思路：
//1、用被复制文件的路径创建一个InputStream对象。
//2、用复制文件的新路径创建一个OutputStream对象。
//3、用read()方法循环把数据读出到一个byte 数组中，直到读出数据的长度小于0。
//4、用write()方法把byte数组中的字节写入输出流。
//5、最后关闭输入流和输出流。