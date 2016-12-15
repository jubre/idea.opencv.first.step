package hello;

import org.opencv.core.Core;

/**
 * Created by junior on 14/12/16.
 */
public class OpenCVVersion {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        System.out.println("hello World! + OpenCV! version: " + Core.VERSION);
    }
}
