package item01;

public class Main {

    public static void main(String[] args) {
        Item item1 = Item.fromTitle("title");
        System.out.println("item1 = " + item1);
        Item item2 = Item.fromYear(2021);
        System.out.println("item2 = " + item2);

        Item item3 = Item.getInstance();
        System.out.println("item3 = " + item3);

        Item item4 = Item.getBook("author");
        System.out.println("item4 = " + item4);
        Item item5 = Item.getAlbum("singer");
        System.out.println("item5 = " + item5);

        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println("(settings1 == settings2) = " + (settings1 == settings2));

        HelloService helloService1 = HelloService.of("ko");
        System.out.println("helloService1.hello() = " + helloService1.hello());
        HelloService helloService2 = HelloService.of("en");
        System.out.println("helloService2.hello() = " + helloService2.hello());
    }
}
