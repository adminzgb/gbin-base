package com.gbin.base.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;

import com.gbin.base.util.X;

public class BasicModel implements Serializable{
	
	@Id
	public String id;

	@Column(name = "create_time")
	public Long createTime;

	@Column(name = "update_time")
	public Long updateTime;

	
	public void beforeSave(){
		long now = System.currentTimeMillis();
		if (createTime == null) {
			createTime = now;
		}
		if (StringUtils.isEmpty(id)) {
			id = generateId();
		}
		updateTime = now;
	}
	
	protected String generateId(){
		return X.number.generateShortUUID();
	}
}
