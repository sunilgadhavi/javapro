package com.example.struts2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class FileDisplay extends ActionSupport {

	private String type = "image/jpeg";
	private String filename;
	private InputStream imageSource;

	private static final long serialVersionUID = 6454467928851439379L;

	public String execute() throws Exception {

		filename = "2.jpg";
		File img = new File("D:\\mine\\2.jpg");
		imageSource = new FileInputStream(img);

		return SUCCESS;
	}

	@SuppressWarnings("unused")
	private String getType() {
		return this.type;
	}

	@SuppressWarnings("unused")
	private String getFilename() {
		return filename;
	}

	public InputStream getImageSource() {
		return imageSource;
	}

	

}
