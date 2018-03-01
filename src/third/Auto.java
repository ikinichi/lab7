package third;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public abstract class Auto {
    public void iLostMyKey(){
        try {
            URI uri = new URI("https://vk.com/video-99126464_456261520");
            java.awt.Desktop.getDesktop().browse(uri);

        } catch (IOException ex) {
            ex.printStackTrace();
        }  catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
}
