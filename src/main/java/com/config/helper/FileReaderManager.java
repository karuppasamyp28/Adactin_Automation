package com.config.helper;

import java.io.IOException;

public class FileReaderManager {

	//singleton design pattern
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstanceFrm() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public ConfigurationReader getInstanceCr() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}
