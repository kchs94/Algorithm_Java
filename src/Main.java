import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Object> opt1 = Optional.ofNullable(null);
        Optional<String> opt2 = Optional.ofNullable("123");

        System.out.println("opt1 = " + opt1.isPresent());
        System.out.println("opt2 = " + opt2.isPresent());

        Optional<String> optStr = Optional.of("김충섭");
        System.out.println(optStr);
        System.out.println(optStr.get());


        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("kimchoongseop");
        System.out.println("name = " + name);
    }
}
