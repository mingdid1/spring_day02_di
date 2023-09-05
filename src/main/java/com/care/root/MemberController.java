package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@Autowired	// �ڵ� ����
	private MemberService ms;
	
	public MemberController() {
		System.out.println("controller");
	}
	
	@GetMapping("/index")	// url ���
	public String index() {
		System.out.println(ms);
		ms.test();
		return "index";		//views -> jsp ���
	}
	
	@GetMapping("/result")
	public String result(Model model) {
		model.addAttribute("member", ms.result());
		return "result";
	}
}
