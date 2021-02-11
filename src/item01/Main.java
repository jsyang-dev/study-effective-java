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
  }
}
