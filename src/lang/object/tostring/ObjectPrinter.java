package lang.object.tostring;

public class ObjectPrinter {

    /*
    파라미터가 오브젝트라 클래스가 늘때 마다 프린트라는 메소드를 안만들어도 모두 사용가능
    추상적인 것에 의존할 수록 다형성을 잘 활용할 수 있다.
    추상적 ex)과일,      동물
    구체적 ex)사과,포도   강아지,고양이

    OCP 원칙 : 확장엔 열려있고 변경엔 닫혀있다
    새로운 클래스를 추가해도 추상적 클래스에 의존해 오버라이딩을 활용해 기능확장 가능
    새로운 클래스를 추가해도 Object를 받는 print라는 메소드는 변경하지 않아도 된다
    */
    public static void print(Object obj) {
        String string = "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }
}
