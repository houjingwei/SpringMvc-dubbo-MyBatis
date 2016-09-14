package com.dsp.utils.exception;

public class CustomException extends RuntimeException {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3745841137570188779L;

	/**
	 * 异常
	 */
	private CustomExceptionEnum exception;

	/**
	 * 消息
	 */
	private String msg;

	public CustomException(CustomExceptionEnum exception) {
		this.exception = exception;
	}

	public CustomException(CustomExceptionEnum exception, String msg) {
		this.exception = exception;
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return exception.getMsg();
	}

	public CustomExceptionEnum getException() {
		if (msg != null) {
			exception.setExtend(msg);
		}
		return exception;
	}

	public void setException(CustomExceptionEnum exception) {
		this.exception = exception;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
