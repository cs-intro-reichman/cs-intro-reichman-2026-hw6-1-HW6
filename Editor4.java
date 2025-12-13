// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.awt.Color;

public class Editor4 {
   public Editor4() {
   }

   public static void main(String[] var0) {
      String filename = var0[0];
      int number = Integer.parseInt(var0[1]);
      Color[][] source = Runigram.read(filename);
      Color[][] grayscaledsource = Runigram.grayScaled(source);
      Runigram.morph(source, grayscaledsource, number);
   }
}
