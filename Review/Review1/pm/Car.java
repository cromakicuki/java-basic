package pm;

public class Car {
    String name;
    int number;

    public Car(String name) {
        this.name = name;
    }
    public Car() {
        this("이름없음",0);
        // this.name = "이름없음";
        // this.number = 0;
    }

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
