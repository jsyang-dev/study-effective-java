package item01;

import java.util.Objects;

public interface HelloService {

    String hello();

    static HelloService of(String lang) {
        if (Objects.equals(lang, "ko")) {
            return new KoreanHelloService();
        }
        return new EnglishHelloService();
    }
}
