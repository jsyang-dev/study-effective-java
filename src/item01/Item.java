package item01;

public class Item {

  protected String title;
  protected int year;

  private static final Item INSTANCE = new Item();

  public static Item fromTitle(String title) {
    Item item = new Item();
    item.title = title;
    return item;
  }

  public static Item fromYear(int year) {
    Item item = new Item();
    item.year = year;
    return item;
  }

  public static Item getInstance() {
    return INSTANCE;
  }

  public static Book getBook(String author) {
    Book book = new Book();
    book.author = author;
    return book;
  }

  public static Album getAlbum(String singer) {
    Album album = new Album();
    album.singer = singer;
    return album;
  }

  @Override
  public String toString() {
    return "Item{" + "title='" + title + '\'' + ", year=" + year + '}';
  }
}
