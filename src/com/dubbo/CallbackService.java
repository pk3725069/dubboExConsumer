package com.dubbo;

public interface CallbackService {
    
	void addListener( CallbackListener listener, String key);

}