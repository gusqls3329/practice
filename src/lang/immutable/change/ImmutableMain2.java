package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);  //리턴 값을 받아서 사용해야됨

        System.out.println("obj1 = " + obj1.getValue());
    }
}
