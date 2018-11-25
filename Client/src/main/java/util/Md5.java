package util;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * 用于将用户密码转换为md5值
 */
public class Md5 {
    /**
     * 利用MD5进行加密
     *  若字符串为空，会抛出异常
     */
    public static String EncoderByMd5(String str) {
        //确定计算方法
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ignore) {
            //do nothong
        }
        Base64.Encoder encoder = Base64.getEncoder();
        //加密后的字符串
        return encoder.encodeToString(md5.digest(str.getBytes(StandardCharsets.UTF_8)));
    }
}