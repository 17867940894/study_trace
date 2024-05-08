package Demo3;

public class Text {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.Start();
        Computer.Connect(new Key());
        Computer.Connect(new Mouse());
        Computer.DisConnect(new Key());
        Computer.DisConnect(new Mouse());
        computer.Eed();
        new USB(){

            @Override
            public void Connect() {

            }

            @Override
            public void disconnect() {

            }

            /*@Override
            public void show(int i) {
                USB.super.show(i);
            }*/
        }.show(6);//TODO 接口的子类实例对象中，抽象方法必须重写，被default修饰的方法可不重写，如果要调用的话，在实例对象后"."就可以了

        new USB() {
            @Override
            public void Connect() {

            }

            @Override
            public void disconnect() {

            }
        }.show(5);
    }
}
