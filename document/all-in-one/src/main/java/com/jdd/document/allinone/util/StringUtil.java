package com.jdd.document.allinone.util;

import java.security.MessageDigest;
import java.util.Random;

/**
 * <p>
 *
 * </p>
 *
 * @author: keller.ji
 * @since: 2019/8/19 10:39
 */
final public class StringUtil {

    /**
     * trim
     */
    public static String trim(String str) {
        if (null == str) {
            return null;
        }

        return str.trim();
    }

    /**
     * 空判断(trim)
     */
    public static boolean isTrimEmpty(String str) {

        if (null == str || trim(str).length() == 0) {
            return true;
        }

        return false;
    }

    /**
     * 随机串
     */
    public static String random(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }

        return sb.toString();
    }

    /**
     * md5
     * @param dataStr
     * @return
     * @throws Exception
     */
    public static String md5(String dataStr) throws Exception{
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(dataStr.getBytes("UTF8"));
        byte s[] = m.digest();

        String result = "";
        for (int i = 0; i < s.length; i++) {
            result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
        }
        return result;
    }

    /**
     * passwd
     *
     * @param dataStr
     * @param salt
     * @return
     * @throws Exception
     */
    public static String passwd(String dataStr, String salt) throws Exception {
        return md5("&"+dataStr+":"+salt+"#");
    }


}