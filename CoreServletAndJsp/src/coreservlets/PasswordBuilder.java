package coreservlets;

import java.util.*;
import java.io.*;
/** Application that writes a simple Java properties file
 * containing usernames and associated passwords.
 */
public class PasswordBuilder {
	public static void main(String[] args) throws Exception {
		Properties passwords = new Properties();
		passwords.put("marty", "martypw");
		passwords.put("bj", "bjpw");
		passwords.put("lindsay", "lindsaypw");
		
		passwords.put("phemmy", "chioma33");
		// This location should *not* be Web-accessible.
		String passwordFile =
			"C:\\Users\\Nerd\\Desktop\\ServletJspProjectPractice\\CoreServletAndJsp\\passwords.properties";
		/*"C:\\Users\\favour\\Desktop\\CoreserlvetProjectTutorial\\passwords.properties";*/
		FileOutputStream out = new FileOutputStream(passwordFile);
		// Using JDK 1.1 for portability among all servlet
		// engines. In JDK 1.2, use "store" instead of "save"
		// to avoid deprecation warnings.
		passwords.save(out, "Passwords");
	}
}