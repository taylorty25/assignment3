package lab.polymorphism;

import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2019
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextBlock block = new TextLine("Hello");
    BoxedBlock blk = new BoxedBlock(block);
    Truncated bl = new Truncated(blk, 3);
    // Print out the block
    TBUtils.print(pen, blk);
    TBUtils.print(pen, bl);
    Centered bb = new Centered(bl, 10);
    Centered b2 = new Centered(block, 20);
    TBUtils.print(pen, new BoxedBlock(bb));
    TBUtils.print(pen, b2);
    RightJustified t1 = new RightJustified(block, 20);
    LeftJustified t2 = new LeftJustified(block, 20);
    TBUtils.print(pen, t1);
    TBUtils.print(pen, t2);
    VComposition t3 = new VComposition(blk, block);
    TBUtils.print(pen, t3);
    VerticallyFlipped t4 = new VerticallyFlipped(t3);
    TBUtils.print(pen, t4);
    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
