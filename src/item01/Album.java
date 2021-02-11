package item01;

public class Album extends Item {

  protected String singer;

  @Override
  public String toString() {
    return "Album{"
        + "singer='"
        + singer
        + '\''
        + ", title='"
        + title
        + '\''
        + ", year="
        + year
        + '}';
  }
}
