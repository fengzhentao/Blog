package com.java1234.util;

import org.apache.shiro.crypto.hash.Md5Hash;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * 加密工具
 * @author Administrator
 *
 */
public class CryptographyUtil {

	
	/**
	 * Md5加密
	 * @param str
	 * @param salt
	 * @return
	 */
	public static String md5(String str,String salt){
		return new Md5Hash(str,salt).toString();
	}
	
	public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
		String password="123456";
		
		System.out.println("Md5加密："+CryptographyUtil.md5(password, "java1234"));

	}
}
