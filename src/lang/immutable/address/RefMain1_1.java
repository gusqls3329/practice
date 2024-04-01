package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.    b와 a는 같은 공간이다
        Address a = new Address("서울");
        Address b = a;  //하나의 객체를 공유하는 것 자체는 막을 수 없음 - 1_2에서는 단순히 다른 객체를 참조하도록 했음
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); //b의 값을 부산으로 변경해야함
        // 사이드이펙트 : 작업 외 다른 추가적 부수효과를 일으킴 지금은 b를 바꾸었지만 a도 바뀜 (코딩에서는 부정적 의미) - 디버깅이 어려움
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
