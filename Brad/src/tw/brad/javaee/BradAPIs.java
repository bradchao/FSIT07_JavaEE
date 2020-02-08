package tw.brad.javaee;

import tw.brad.myutils.BCrypt;

public class BradAPIs {
	public static boolean chPassword(String plainPW, String hashPW) {
		boolean isRight = false;
		if (hashPW.startsWith("$2a$")) {
			isRight = BCrypt.checkpw(plainPW, hashPW);
		}else {
			isRight = true;
		}
		return isRight;
	}
}
