package dao;

import org.springframework.stereotype.Service;

@Service
public class TestDaoImpl implements TestDao{
	@Override
	public void sayHello() {
		System.out.println("Hello, Study hard! 从IDEA部署到github！");
	}
}
