package com.sample.tests;

import com.sample.crawler.MapImageUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * @author saifasif
 */
public class MapImageUtilsTest {

    @Test
    public void testMapper() throws IOException {
        MapImageUtils.getImageStream("48.1596382", "11.5776053");
    }

}



