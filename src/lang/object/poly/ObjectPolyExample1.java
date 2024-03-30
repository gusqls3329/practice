package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Object dog1 = new Dog();
        Car car = new Car();


        action(dog);
        action(dog1);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound(); //컴파일 오류, Object는 sound()가 없다.
        //obj.move(); //컴파일 오류, Object는 move()가 없다.
        //obj는 최종 부모이므로 올라가서 메소드를 찾을 수 없음.

        //Object는 자신의 메소드 밖에 모름 - 객체에 맞는 다운캐스팅 필요
        //instanceof : 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자 이다.
        //참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 해당 연산자를 사용한다.
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
