package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-23
 */
public class JPGImageReaderFactory implements ImageReaderFactory {

    @Override
    public ImageReader createImageReader() {
        return new JPGImageReader();
    }
}
