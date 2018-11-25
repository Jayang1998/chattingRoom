package util;

import org.junit.Test;

public class Md5Test {
    @Test
    public void testMd5(){
        System.out.println(Md5.EncoderByMd5(""));
        System.out.println(Md5.EncoderByMd5("123"));
        System.out.println(Md5.EncoderByMd5("2333"));
    }

}
