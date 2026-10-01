package Zadachnik;

public class Gun {
    static private final int DEFAULT_BULLET_COUNT = 5;
    private int bulletCount;
    private int maxBulletCount;

    public Gun(int bulletCount) {
        if (bulletCount < 0) {
            this.bulletCount = DEFAULT_BULLET_COUNT;
        } else {
            this.bulletCount = bulletCount;
        }
        this.maxBulletCount=this.bulletCount;
    }

    public Gun() {
        this.bulletCount = DEFAULT_BULLET_COUNT;
    }

    public void fire() {
        if (bulletCount < 1) {
            System.out.println("клац");
        } else {
            System.out.println("пау");
            bulletCount--;
        }
    }
    public void reload() {
        this.bulletCount=this.maxBulletCount;
        System.out.println("сквч-вщ");
}
