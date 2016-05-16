package com.elite.commoditymanagement.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * 
 * AES加密对长度有限制
 */
public class Encription {
    private static String charset = "utf-8";

    @SuppressWarnings("restriction")
	public static String encrypt(String src, String key) {
        try {
            //创建密钥
            byte[] buf_key = key.getBytes(charset);
            //创建一个空的16位字节数组，默认0
            byte[] buf = new byte[16];
            //过短，补零；过长丢弃
            for (int i = 0; i < buf_key.length && i < buf.length; i++) {
                buf[i] = buf_key[i];
            }
            SecretKeySpec secretKey = new SecretKeySpec(buf,"AES");

            //加密
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] out = cipher.doFinal(src.getBytes(charset));

            //转为串
            return new sun.misc.BASE64Encoder().encode(out);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @SuppressWarnings("restriction")
	public static String decrypt(String src, String key) {
        try {
            // 处理密钥
            byte[] buf_key = key.getBytes(charset);
            // 创建一个空的16位字节数组，默认0
            byte[] buf = new byte[16];
            // 过短，补零；过长丢弃
            for (int i = 0; i < buf_key.length && i < buf.length; i++) {
                buf[i] = buf_key[i];
            }
            SecretKeySpec secretKey = new SecretKeySpec(buf, "AES");

            //密码还原
            buf = new sun.misc.BASE64Decoder().decodeBuffer(src);

            //解密
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] out = cipher.doFinal(buf);
            //转为串
            return new String(out,charset);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        String str = "12345678";
        String key = Encription.encrypt(str, "Eng");
        System.out.println(key);

        String de = Encription.decrypt(key, "Eng");
        System.out.println(de);
    }
}