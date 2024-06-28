package com.mystroy001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	//가상주소 /member/insert → /WEB-INF/view/member/insert.jsp 연결
	@RequestMapping(value="/member/insert", method = RequestMethod.GET)
	public String insert() {
		System.out.println("MemberController insert()");
		// /insert → /WEB-INF/views/member/insert.jsp 주소 변경없이 이동하는 방식(forword)
		return "/member/insert";
	}
	
	@RequestMapping(value = "/member/insertPro", method = RequestMethod.POST)
	public String insertPro() {
		System.out.println("MemberController insertPro()");
		//회원 가입 처리
		
		// /member/login 주소 변경하면서 이동
		return "redirect:/member/login";
	}
	
	@RequestMapping(value = "/member/login", method = RequestMethod.GET)
	public String login() {
		System.out.println("MemberController login()");
		
		return "/member/login";
	}
	
	@RequestMapping(value = "/member/loginPro", method = RequestMethod.POST)
	public String loginPro() {
		System.out.println("MemberController loginPro");
		//로그인 처리
		
		return "redirect:/member/main";
	}

	@RequestMapping(value = "/member/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("MemberController main()");
		
		return "/member/main";
	}
	
	@RequestMapping(value = "/member/info", method = RequestMethod.GET)
	public String info() {
		System.out.println("MemberController info()");
		
		return "/member/info";
	}
	
	@RequestMapping(value = "/member/update", method = RequestMethod.GET)
	public String update() {
		System.out.println("MemberController update()");
		
		return "/member/update";
	}
	
	@RequestMapping(value = "/member/updatePro", method = RequestMethod.POST)
	public String updatePro() {
		System.out.println("MemberController updatePro()");
		//회원정보수정 처리
		
		return "redirect:/member/main";
	}
	
	@RequestMapping(value = "/member/delete", method = RequestMethod.GET)
	public String delete() {
		System.out.println("MemberController delete()");
		
		return "/member/delete";
	}
	
	@RequestMapping(value = "/member/deletePro", method = RequestMethod.POST)
	public String deletePro() {
		System.out.println("MemberController deletePro");
		//회원정보삭제 처리
		
		return "redirect:/member/insert";
	}
	

}
