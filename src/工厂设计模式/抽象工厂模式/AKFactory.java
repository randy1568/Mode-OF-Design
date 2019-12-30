package 工厂设计模式.抽象工厂模式;

public class AKFactory {

    public Bullet produceBullet(){
        return new AKBullet();
    }

    public Gun produceGun(){
        return new Ak();
    }

}
