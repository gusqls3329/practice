package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {

        //동일성 - 완전히 같은 존재, 물리적으로 같은 메모리에 있는 객체 인스턴스인지 참조값을 확인함
        //동등성 - 논리적으로 같은 지

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));  //동일성 비교
        System.out.println("equality = " + (user1.equals(user2)));  //동등성 비교

        //동등성은 왜 fales? 오브젝트가 기본으로 제공하는 equals는 == 비교를 함
        //이유는 클래스마다 동등의 기준이 달라서 클래스 용도에 맞게 오버라이딩을 해야됨
    }
}
