package lab.polymorphism;

public class Centered implements TextBlock {
  TextBlock text;
  int wid;

  public Centered(TextBlock text, int wid) {
    this.text = text;
    this.wid = wid;
  }

  public String row(int i) throws Exception {
    try {
      if (this.wid > this.text.row(i).length()) {
        return TBUtils.spaces((this.wid - this.text.width()) / 2) + this.text.row(i) + TBUtils
            .spaces(((this.wid - this.text.width()) / 2) + ((this.wid - this.text.width()) % 2));
      } else {
        return new Truncated(this.text, this.wid).row(i);
      }
    } catch (Exception e) {
      throw new Exception("Invalid row " + i);
    }
  }

  public int height() {
    return this.text.height();
  } // height()

  public int width() {
    return this.wid;

  } // width()
}

