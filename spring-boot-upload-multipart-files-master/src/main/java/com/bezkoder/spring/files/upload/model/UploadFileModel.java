package com.bezkoder.spring.files.upload.model;

import org.springframework.web.multipart.MultipartFile;

public class UploadFileModel {
	private String mark;
	private MultipartFile[] files;

	public MultipartFile[] getFiles() {
		return files;
	}

	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}
	
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
}
