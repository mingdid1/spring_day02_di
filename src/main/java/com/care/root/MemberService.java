package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	// @Autowired
	// memberDAO, ddd
	// bean 2�� ����(memberDAO, ddd)�Ǿ����� ��� �̸����� �����Ͽ� ���
	
	// inject : �ڵ�����, Qualifier : �̸� ����
	@Inject
	@Qualifier("ddd")
	MemberDAO dao;
	
	public MemberService() {
		System.out.println("service");
	}
	
	public void test() {
		System.out.println("svr test����");
		dao.test();
	}
	
	public MemberDTO result() {
		return dao.result();
	}
}
