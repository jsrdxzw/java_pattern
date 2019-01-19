package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-23
 */
public class GifImageReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        //创建gif图片的读取对象
        return new GifImageReader();
    }
}
