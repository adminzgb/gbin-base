package com.gbin.base.model;

import com.gbin.base.enums.ReturnCode;

/**
 * 返回json类实体
 * @author Administrator
 *
 */
public class JsonMessage {
	
	private ReturnCode code = ReturnCode.SUCCESS;
	private Object object;
	
	public ReturnCode getCode() {
		return code;
	}
	public void setCode(ReturnCode code) {
		this.code = code;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	
	

}
