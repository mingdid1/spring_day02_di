package com.care.root;

import org.springframework.stereotype.Repository;

// d123 => 이름 지정해주기
@Repository("d123")
public class MemberDAO {
	
	public MemberDAO() {
		System.out.println("dao");
	}
	
	public void test() {
		System.out.println("dao test실행");
	}
	
	public MemberDTO result() {
		MemberDTO dto = new MemberDTO();
		dto.setId("aaa");
		dto.setName("111");
		return dto;
	}
}
