import java.awt.GraphicsEnvironment;

public class Fonts {
    public static void main(String[] args) {

        String[] fontsName =
            GraphicsEnvironment.getLocalGraphicsEnvironment()
            .getAvailableFontFamilyNames();

        for (String fontName : fontsName) {
            System.out.println(fontName);
        }
    }
}