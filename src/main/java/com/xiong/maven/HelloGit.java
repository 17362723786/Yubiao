package com.xiong.maven;

public class HelloGit {
	public  String sayHello(String name) {
		return "hello" + name + "world!";
	}
	public static void main(String[] aargs) {
		System.out.println("更新1");
		System.out.println("创建分支");
<<<<<<<
		System.out.println("分支添加");
=======
		System.out.println("主干添加");
>>>>>>> frfs/heads/dev
	}
}
