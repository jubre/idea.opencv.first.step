package hello;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by junior on 15/12/16.
 */
public class OpenCVVersionTest {

    @Test
    public void verifyOpenCVVersion(){
        assertEquals("2.4.13.1",new OpenCVVersion().getOpenCVVersion());
    }

}
