package lab.polymorphism;

public class HorizontallyFlipped implements TextBlock {
  TextBlock text;

  public HorizontallyFlipped(TextBlock text) {
    this.text = text;
  }

  public String row(int i) throws Exception {
    try {
      StringBuilder str = new StringBuilder(this.text.row(i));
      str.reverse();
      return str.toString();
    } catch (Exception e) {
      throw new Exception("Invalid row " + i);
    }
  }

  public int height() {
    return this.text.height();
  }

  public int width() {
    return this.text.width();
  }
}

