package com.heitian.ssm.utils;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class DecriptUtil {

    /** 
     * @author��jiayangchen
     * @description�� MD5����
     * @parameter��   str���������ַ���
     * @return��  ���ܴ�
    **/
    public static String MD5(String str) {
        try {
            // ���MD5ժҪ�㷨�� MessageDigest ����
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // ʹ��ָ�����ֽڸ���ժҪ
            mdInst.update(str.getBytes());
            // �������
            byte[] md = mdInst.digest();
            // ������ת����ʮ�����Ƶ��ַ�����ʽ
            StringBuffer hexString = new StringBuffer();
            // �ֽ�����ת��Ϊ ʮ������ ��
            for (int i = 0; i < md.length; i++) {
                String shaHex = Integer.toHexString(md[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
    


}