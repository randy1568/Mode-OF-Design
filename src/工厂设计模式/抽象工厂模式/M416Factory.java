package 工厂设计模式.抽象工厂模式;

public class M416Factory {

    public Bullet produceBullet(){
        return new M416Bullet();
    }

    public Gun produceGun(){
        return new M416();
    }

}
