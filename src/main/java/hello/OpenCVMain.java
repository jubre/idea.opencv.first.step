package hello;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

/**
 * Created by junior on 15/12/16.
 */
public class OpenCVMain {

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        System.out.println("hello World! + OpenCV! version: " + new OpenCVVersion().getOpenCVVersion());

        Mat m = Highgui.imread("/Users/junior/WorkSpace/idea.opencv.first.step/src/lena.png", Highgui.CV_LOAD_IMAGE_COLOR);

        int type = BufferedImage.TYPE_BYTE_GRAY;
        if ( m.channels() > 1 ) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        int bufferSize = m.channels()*m.cols()*m.rows();
        byte [] b = new byte[bufferSize];
        m.get(0,0,b); // get all the pixels
        BufferedImage image = new BufferedImage(m.cols(),m.rows(), type);
        final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        System.arraycopy(b, 0, targetPixels, 0, b.length);


        Image img2 = image;

        ImageIcon icon=new ImageIcon(img2);
        JFrame frame=new JFrame();
        frame.setTitle("lena");
        frame.setLayout(new FlowLayout());
        frame.setSize(img2.getWidth(null)+50, img2.getHeight(null)+50);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
