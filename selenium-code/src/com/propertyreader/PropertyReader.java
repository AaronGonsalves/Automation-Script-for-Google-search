package com.propertyreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
	
public class PropertyReader {
    	
		static Properties prop = new Properties();
	
		static {
			try {
				File file = new File("resources/selenium.properties");
				
				FileInputStream fileInput = new FileInputStream(file);
				
				prop.load(fileInput);
				
			} catch(IOException ep) {
				ep.printStackTrace();
			}
		}

		public static String getProperty(String key) {
			String val = prop.getProperty(key);
			Objects.requireNonNull(val);
			return val;
		}
}