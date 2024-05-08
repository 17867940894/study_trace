package homework3;

public class CellPhone{
    public void testWork(){
        new Counter() {
            @Override
            public void work() {
                System.out.println("计算器的计算方法已被实现");
            }
        }.work();
    }
}
