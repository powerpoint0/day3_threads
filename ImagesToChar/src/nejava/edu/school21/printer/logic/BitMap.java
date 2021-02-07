package nejava.edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BitMap {

    BufferedImage pixelData;

    public BitMap(String fileName) throws IOException {
        File f = new File(fileName);
        this.pixelData = ImageIO.read(f);
    }

    public void convertBmpToCommandLine() {
        for(int i = 0; i < this.pixelData.getWidth(); i++) {
            for(int j = 0; j < this.pixelData.getHeight(); j++){
                int temp = this.pixelData.getRGB(j,i);

                if(temp == Color.white.getRGB()) {
                    System.out.print(".");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}