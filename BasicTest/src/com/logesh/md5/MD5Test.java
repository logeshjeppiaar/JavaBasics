package com.logesh.md5;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author Logesh
 *
 */
public class MD5Test {

	public static void main(String[] args) {
		String stringTHash = "XXX";

		String hashedString = DigestUtils.md5Hex(stringTHash);

		System.out.println(hashedString);
	}

}
