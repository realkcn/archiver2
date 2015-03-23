package cn.kcn.utils;

/**
 * Created by kcn on 15/3/20.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.security.MessageDigest;

@SuppressWarnings("UnusedDeclaration")
public class Md5Utils {
    private static final Logger LOG = LoggerFactory.getLogger(Md5Utils.class);

    /**
     * 将字节数组转换为String
     * @param b byte[]
     * @return String
     */
    public static String bytesToString(byte[] b) {
        StringBuffer result = new StringBuffer("");
        int length = b.length;
        for (int i=0; i<length; i++) {
            result.append((char)(b[i] & 0xff));
        }
        return result.toString();

    }


    public static String getMd5(String str, Object salt) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            md5.update(str.getBytes());
            md5.update(salt.toString().getBytes());
            return bytesToString(md5.digest());
        } catch (Exception e) {
            return "";
        }
    }

}
