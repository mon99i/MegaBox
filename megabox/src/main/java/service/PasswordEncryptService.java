package service;

import java.security.*;
import javax.crypto.*;
import java.math.*;

//�̿��ڰ� �Է��� ��й�ȣ ���� �ؽ÷� �ٲپ� ��ȯ�ϴ� ���
public class PasswordEncryptService {
	
	//hash plaintext by SHA-512 Algorithm
	public static String passwordEncrypt(String plaintext) {
		
		String hashedPassword = "";
		
		String salt = "Switzerland+comvi";
		
		try {
			MessageDigest msg = MessageDigest.getInstance("SHA-512");
			msg.update(salt.getBytes());
			
			hashedPassword = String.format("%128x", new BigInteger(1, msg.digest()));
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return hashedPassword;
	
		
	}
	
}
