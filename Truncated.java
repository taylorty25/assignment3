package lab.polymorphism;

public class Truncated implements TextBlock {

  TextBlock text = new TextLine("");
  int trunc;

  public Truncated(TextBlock text, int trunc) {
    this.text = text;
    this.trunc = trunc;
  }

  public String row(int i) throws Exception {
    try {
      return text.row(i).substring(0, trunc);
    } catch (Exception e) {
      throw new Exception("Invalid row " + i);
    } // catch (Exception)
  }

  public int height() {
    return this.text.height();
  } // height()

  public int width() {
    return this.trunc;

  } // width()
}
