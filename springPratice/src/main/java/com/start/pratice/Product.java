package com.start.pratice;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class Product implements Serializable
{
    private static final long serialVersionUID = 74458L;
 
    private String name;
 
    private String description;
 
    private MultipartFile file;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
     
    
}

