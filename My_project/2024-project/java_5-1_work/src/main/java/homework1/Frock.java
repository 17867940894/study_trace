package homework1;

public class Frock {
    //1.1 在 Frock类中声明私有的静态属性 currentNum [int类型]，初始值为 10000，作为衣服出厂的序列号起始值。
    private static int currentNum = 1000;
    //1.4在Frock类中声明 serialNumber(序列号)属性，并提供对应的get方法；
    private int serialNumber;

    public static int getCurrentNum() {
        return currentNum;
    }

    public static void setCurrentNum(int currentNum) {
        Frock.currentNum = currentNum;
    }

    public int getSerialNumber() {
        serialNumber = currentNum;
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Frock(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    //1.2 声明公有的静态方法 getNextNum，作为生成上衣唯一序列号的方法。每调用一次，将currentNum 增加100 并返回值
    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }
}
