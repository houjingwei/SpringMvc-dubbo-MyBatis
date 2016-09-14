package com.dsp.utils.exception;

public enum CustomExceptionEnum {
	// 系统异常-1至100
	ERROR_SYSTEM(1, "系统异常"),
	ERROR_DATA(2, "数据异常"),
	ERROR_PEMISS(3, "无权限操作,请联系管理员"),

	// 缓存异常100至200
	EXC_CACHE_ERROR(100, "缓存组建异常"),

	// 业务异常 300至1000
	EXC_ADMIN_NOT_EXIST(300, "用户不存在"),
	EXC_ADMIN_LOCK(301, "用户被锁定"),
	EXC_PASS_ERROR(302, "密码错误"), 
	EXC_CAPTURE_ERROR(303,"验证码错误"), 
	EXC_INPUT_ERROR(304, "输入错误"), 
	EXC_NOUSER_ERROR(305, "用户不存在"), 
	EXC_OPWD_ERROR(306, "原始密码错误");

	/**
	 * 错误码
	 */
	private int code;

	/**
	 * 错误信息
	 */
	private String msg;

	/**
	 * 扩展信息
	 */
	private String extend;

	private CustomExceptionEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		if (extend != null && !"".equals(extend)) {
			return msg + "," + extend;
		} else {
			return msg;
		}
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}
}
