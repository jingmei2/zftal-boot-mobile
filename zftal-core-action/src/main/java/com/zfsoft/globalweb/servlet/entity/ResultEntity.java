package com.zfsoft.globalweb.servlet.entity;


public class ResultEntity<T> {

	public int code;//标识码
	public String msg;//标识字符
	public T data;

	public ResultEntity(int code, String msg, T object){
		this.code = code;
		this.msg  = msg;
		data = object;
	}

	@Override
	public String toString() {
		return "ResultEntity [code=" + code + ", msg=" + msg + ", data=" + data
				+ "]";
	}



}
