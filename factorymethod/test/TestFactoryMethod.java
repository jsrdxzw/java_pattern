import com.natsuki.GifImageReaderFactory;
import com.natsuki.ImageReaderFactory;

/**
 * @author xuzhiwei
 * created at 2018-11-23
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        ImageReaderFactory factory = new GifImageReaderFactory();
        factory.createImageReader().readImage();
    }
}
