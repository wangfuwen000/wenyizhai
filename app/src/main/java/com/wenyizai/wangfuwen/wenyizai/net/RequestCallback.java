package com.wenyizai.wangfuwen.wenyizai.net;

public interface RequestCallback
{
	public void onSuccess(String content);

	public void onFail(String errorMessage);
}
