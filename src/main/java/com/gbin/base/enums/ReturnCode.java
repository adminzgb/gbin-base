package com.gbin.base.enums;

public enum ReturnCode {

	SUCCESS("200"),FAIL("500");
	
	String code;
	
	private ReturnCode(String code){
		this.code = code;
	}
}
