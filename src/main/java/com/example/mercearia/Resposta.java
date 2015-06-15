package com.example.mercearia;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Resposta {

	private boolean error;
	private String msg;
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}


	
}
