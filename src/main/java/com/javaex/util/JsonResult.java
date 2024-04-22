package com.javaex.util;

public class JsonResult {

	private String result; 
	private Object apiData; 
	private String message; 

	private JsonResult(Object apiData) {
		result = "success";
		this.apiData = apiData;
		message = null;
	}

	private JsonResult(String message) {
		result = "fail";
		apiData = null;
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public Object getApiData() {
		return apiData;
	}

	public String getMessage() {
		return message;
	}
	
	public static JsonResult success(Object data) {
		return new JsonResult(data);
	}

	public static JsonResult fail(String message) {
		return new JsonResult(message);
	}
}