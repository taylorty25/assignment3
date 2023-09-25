package lab.polymorphism;

public class VerticallyFlipped implements TextBlock {
  TextBlock text;

  public VerticallyFlipped(TextBlock text) {
    this.text = text;
  }

  public String row(int i) throws Exception {
    try {
      return this.text.row(this.text.height() - i - 1);
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

