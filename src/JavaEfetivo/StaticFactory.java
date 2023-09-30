package JavaEfetivo;

import java.time.LocalDateTime;

public class StaticFactory {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.from(LocalDateTime.now());
        System.out.println(localDateTime);
    }
}
