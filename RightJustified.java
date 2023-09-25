package lab.polymorphism;

public class RightJustified implements TextBlock {
  TextBlock text;
  int wid;

  public RightJustified(TextBlock text, int wid) {
    this.text = text;
    this.wid = wid;
  }

  public String row(int i) throws Exception {
    try {
      if (this.wid > this.text.row(i).length()) {
        return TBUtils.spaces(this.wid - this.text.width()) + this.text.row(i);
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
