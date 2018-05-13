package test;

import javax.annotation.Resource;

import org.junit.Test;

import cn.yuzexing.service.UserServiceImpl;

public class testutil extends BaseTestMyBatis {
	@Resource
	private UserServiceImpl uservice;

	@Test
	public void test() {

	}

}
