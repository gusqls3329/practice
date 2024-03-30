package lang.object;

//명시적 상속 - 오브젝트를 상속 받지 않음 but Parent는 오브젝트 상속 받음
public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
