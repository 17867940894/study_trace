package string;

public class Demo3 {
    public static void main(String[] args) {
        //根据一个文件的全限定名，判断类型
        String fileName = "yaTou.png";
        functionOne(fileName);
        functionTwo(fileName);
    }

    private static void functionTwo(String fileName) {
        if (fileName.endsWith("png") || fileName.endsWith("jpg") || fileName.endsWith("jpeg"))
            System.out.println("图片");
        if (fileName.endsWith("mp3") || fileName.endsWith("wma"))
            System.out.println("音频");
        if (fileName.endsWith("avi") || fileName.endsWith("mp4") || fileName.endsWith("wmv"))
            System.out.println("视频");
    }

    private static void functionOne(String fileName) {
        String fileType = fileName.substring(fileName.indexOf("."));
        switch (fileType){
            case ".png":
            case ".jpg":
            case ".jpeg":
                System.out.println("图片");
                break;
            case ".avi":
            case ".mp4":
            case ".wmv":
                System.out.println("视频");
                break;
            case ".mp3":
            case ".wma":
                System.out.println("音频");
                break;
        }
    }
}
