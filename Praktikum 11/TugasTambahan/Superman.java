public class Superman extends Kryptonian {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    @Override
    public void takeOff() {
        System.out.println("Superman lepas landas.");
    }

    @Override
    public void land() {
        System.out.println("Superman mendarat.");
    }

    @Override
    public void fly() {
        System.out.println("Superman terbang.");
    }

    public void leapBuilding() {
        System.out.println("Superman melompati gedung.");
    }

    public void stopBullet() {
        System.out.println("Superman menghentikan peluru.");
    }

    @Override
    public void eat() {
        System.out.println("Nasi Goreng");
    }

    public String getName() {
        return name;
    }
}