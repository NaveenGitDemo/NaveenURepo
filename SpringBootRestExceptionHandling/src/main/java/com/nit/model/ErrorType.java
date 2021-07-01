package com.nit.model;

public class ErrorType {

	private String message;
	private String code;
	private String error;
	private String classType;
	private Integer reqId;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		return code;
	}
	public ErrorType(String message, String code, String error, String classType, Integer reqId) {
		super();
		this.message = message;
		this.code = code;
		this.error = error;
		this.classType = classType;
		this.reqId = reqId;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "ErrorType [message=" + message + ", code=" + code + ", error=" + error + ", classType=" + classType
				+ ", reqId=" + reqId + "]";
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	
}
