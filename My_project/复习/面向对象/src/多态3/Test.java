package 多态3;

public class Test {
    public static void main(String[] args) {
        show(new BasketballPlayer());
        show(new FootballPlayerl());
        show(new PingPongPlayer());
    }

    public static void show(Sportsman sportsman){
        sportsman.play();
        if (sportsman instanceof BasketballPlayer) {
            BasketballPlayer b = (BasketballPlayer) sportsman;
            b.nb();
        }else if(sportsman instanceof FootballPlayerl){
            FootballPlayerl f = (FootballPlayerl) sportsman;
            f.Money();
        }else if(sportsman instanceof PingPongPlayer){
            PingPongPlayer p = (PingPongPlayer) sportsman;
            p.nb();
        }
    }
}

abstract class Sportsman{
    public abstract void play();


}

class FootballPlayerl extends Sportsman{

    @Override
    public void play() {
        System.out.println("踢球");
    }

    public void Money(){
        System.out.println("踢得菜拿钱还多");
    }
}

class BasketballPlayer extends Sportsman{

    @Override
    public void play() {
        System.out.println("投篮");
    }

    public void nb(){
        System.out.println("大灌篮");
    }
}

class PingPongPlayer extends Sportsman{

    @Override
    public void play() {
        System.out.println("打乒乓球");
    }

    public void nb(){
        System.out.println("你菜得就像个世界冠军");
    }
}