package tw.brad.javaee;

import tw.brad.myutils.BCrypt;

public class BradAPIs {
	public static boolean chPassword(String plainPW, String hashPW) {
		boolean isRight = false;
		System.out.println("1:" + plainPW);
		System.out.println("2:" + hashPW);
		if (hashPW.startsWith("$2a$")) {
			isRight = BCrypt.checkpw(plainPW, hashPW);
		}else {
			isRight = true;
		}
		return isRight;
	}
}
