import somepackage.Other;
import somepackage.Some;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Some some = new Some("Это уже не секрет");
        System.out.println(some.toString());
        System.out.println("some.count() = " + some.count());
        System.out.println("some.getSecret() = " + some.getSecret());
        some.setNoMoreSecrets(some.getДаТакТожеМожно());
        System.out.println(some.getSecret( true));
    }
}
