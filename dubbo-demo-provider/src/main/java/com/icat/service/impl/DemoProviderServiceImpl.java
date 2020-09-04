package com.icat.service.impl;

import com.icat.service.DemoProviderService;

/**
 * 服务提供者接口实现类
 * @author icat
 *
 */
public class DemoProviderServiceImpl implements DemoProviderService {

	public String sayHello(String name) {
		return "服务提供者 -------------- " + name;
	}

}
