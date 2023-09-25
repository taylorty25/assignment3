package lab.polymorphism;

public class LeftJustified implements TextBlock {
  TextBlock text;
  int wid;

  public LeftJustified(TextBlock text, int wid) {
    this.text = text;
    this.wid = wid;
  }

  public String row(int i) throws Exception {
    try {
      if (this.wid > this.text.row(i).length()) {
        return this.text.row(i) + TBUtils.spaces(this.wid - this.text.width());
      } else {
        return new Truncated(this.text, this.wid).row(i);
      }
    } catch (Exception e) {
      throw new Exception("Invalid row " + i);
    }
  }

  public int height() {
    return this.text.height();
  }

  public int width() {
    return this.wid;
  }

}
