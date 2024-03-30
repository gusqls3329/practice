package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        Parent parent = new Parent();
        //parent.childMethod();
        parent.parentMethod();

        // toString()은 Object 클래스의 메서드
        // toString()은 객체에 대한 정보를 제공해줌
        String string = child.toString(); //오브젝트의 toString()을 가져옴
        System.out.println(string);

        /*오브젝트 상속이유
        1. 공통기능 제공 : 새로운 메소드를 항상 만들어야 하고 같은 기능의 메소드 이름이 다를 수 있다.
                         공통 기능을 만들어 편리하게 제공(상속) 받을 수 있음
        2. 다형성의 기본구현 : 오브젝트는 모든 객체를 담을 수 있다.
                            타입이 다른 객체를 어딘가에 보관해야된다면 오브젝트에 보관

        * 다형성을 제대로 활용하려면? - 다형적 참조 + 메서드 오버라이딩을 함께 사용

        */
    }

}
