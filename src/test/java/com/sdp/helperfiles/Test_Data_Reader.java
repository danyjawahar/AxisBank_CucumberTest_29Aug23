package com.sdp.helperfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Data_Reader {
	public static Properties p;

	public Test_Data_Reader() throws IOException {
		File f = new File(
				"E:\\Selenium with Java\\HP_Laptop Selenium Files\\Revision_Workspace\\Maven_Project_Revision_09May23\\src\\main\\java\\com\\sdp\\helperfiles\\Axis_LoginCredentials.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	public String get_Browser() throws IOException {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String get_Url() {
		String url = p.getProperty("url");
		return url;
	}
	public String get_CustID() {
		String custID = p.getProperty("custid");
		return custID;
	}
	public String get_mPin() {
		String mPin = p.getProperty("mPin");
		return mPin;
	}
}
