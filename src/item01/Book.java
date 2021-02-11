package item01;

public class Book extends Item {

  protected String author;

  @Override
  public String toString() {
    return "Book{"
        + "author='"
        + author
        + '\''
        + ", title='"
        + title
        + '\''
        + ", year="
        + year
        + '}';
  }
}
