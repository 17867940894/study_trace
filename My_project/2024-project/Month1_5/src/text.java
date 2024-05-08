import java.io.File;

public class text {
    public static void main(String[] args) {

        //地址
        String path = "H:";
        //修改前后缀
        String modify = "ncm";
        //修改后后缀
        String modifyAfter = "mp3";
        //执行方法ReplaceZip()
        ReplaceZip(path, modify, modifyAfter);
    }

    public static void ReplaceZip(String path, String modify, String modifyAfter) {
        //初始化File
        File file = new File(path);
        //定义File 数组等于file.listfile
        File[] files = file.listFiles();
        //使用三目运算，完成文件后缀名更改
        for (File subfile : files) {
            //判断文件夹下是否还存在文件夹,如果存在使用递归调用批量更改
            if (subfile.isDirectory()) {
//                subfile.renameTo(new File(subfile.getParent()+"/"+modify.));
                ReplaceZip(subfile.getPath(), modify, modifyAfter);
            }
            //如果文件夹是文件就执行后缀更改
            else {
                String name = subfile.getName();
                //如果文件名称后缀为ziw进行修改为zip
                if (name.endsWith(modify)) {
                    subfile.renameTo(new File(subfile.getParent() + "/" + name.substring(0, name.indexOf(modify)) + modifyAfter));
                }
            }
        }
    }
}
