package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	// @Autowired
	// memberDAO, ddd
	// bean 2개 생성(memberDAO, ddd)되어있을 경우 이름으로 지정하여 사용
	
	// inject : 자동주입, Qualifier : 이름 지정
	@Inject
	@Qualifier("ddd")
	MemberDAO dao;
	
	public MemberService() {
		System.out.println("service");
	}
	
	public void test() {
		System.out.println("svr test연동");
		dao.test();
	}
	
	public MemberDTO result() {
		return dao.result();
	}
}
