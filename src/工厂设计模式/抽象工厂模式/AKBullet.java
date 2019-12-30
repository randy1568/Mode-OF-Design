package 工厂设计模式.抽象工厂模式;

public class AKBullet implements Bullet {
    @Override
    public void load() {
        System.out.println("给AK装载AK子弹");
    }
}
