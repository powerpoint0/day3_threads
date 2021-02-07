package nejava.edu.school21.printer.app;
import nejava.edu.school21.printer.logic.BitMap;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {

        if (args.length > 0) {
            String file = args[0];
            BitMap bitMapFromFile = new BitMap(file);
            bitMapFromFile.convertBmpToCommandLine();
        }
    }
}
