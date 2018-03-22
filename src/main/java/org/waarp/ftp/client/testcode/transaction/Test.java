package org.waarp.ftp.client.testcode.transaction;

import java.io.IOException;

import org.waarp.ftp.client.testcode.FtpClient;

public class Test {

	public static void main(String[] args) {
		try {
			FtpClient.init(args);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
