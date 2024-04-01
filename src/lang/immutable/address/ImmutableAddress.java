package lang.immutable.address;

public class ImmutableAddress {

    private final String value;
    //final을 사용 : 상태(값)이 바뀌지않으므로 set 메소드를 사용하지 못함

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
