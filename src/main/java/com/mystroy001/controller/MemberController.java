package com.mystroy001.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mystroy001.domain.MemberDTO;
import com.mystroy001.service.MemberService;

@Controller
public class MemberController {
	
	//부모(인터페이스) 자식(인터페이스를 상속받은 클래스) 객체 생성
	
	//MemberService 객체 생성 → 멤버 변수
	//MemberService memberService = new MemberService() 자바단에서 객체 생성
	//멤버변수를 정의하고 root-context.xml에서 객체를 생성해서 멤버 변수에 전달(주입)
	//의존관계주입(DI; Dependency Injection) 스프링에서 객체를 생성하는 방식 1) 생성자, 2) 메소드
	private MemberService memberService;
	
	//1) memberService를 받는 생성자 → root-context.xml에서 생성자를 통해서 객체 생성 값 전달
//	@Inject
//	public MemberController(MemberService memberService) {
//		System.out.println("MemberController 생성자");
//		this.memberService = memberService;
//	}
	
	//2) memberService를 받는 set 메소드 준비 → root-context.xml에서 set메소드를 통해 객체 생성 값 전달
	@Inject
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	//가상주소 /member/insert → /WEB-INF/view/member/insert.jsp 연결
	@RequestMapping(value="/member/insert", method = RequestMethod.GET)
	public String insert() {
		System.out.println("MemberController insert()");
		// /insert → /WEB-INF/views/member/insert.jsp 주소 변경없이 이동하는 방식(forword)
		return "/member/insert";
	}
	
	@RequestMapping(value = "/member/insertPro", method = RequestMethod.POST)
	public String insertPro(MemberDTO memberDTO) {
		System.out.println("MemberController insertPro()");
		//회원 가입 처리
		//한글 처리 → web.xml에 작성해줌으로 처리
		
		//request 태그 이름에 해당하는 파라미터 값을 가져오기 → 변수에 저장
		//String id = request.getParameter("id");
		//String pw = request.getParameter("pw");
		//String name = request.getParameter("name");
		
		//패키지 com.mystory001.domain MemberDTO(MemberBean, MemberVo)
		//MemberDTO 객체 생성
		//MemberDTO 애노테이션 X → web.xml에 작성할 필요없음
		//set 메서드 호출 → 값 저장
		//memberDTO.setId(id);
		//memberDTO.setPw(pw);
		//memberDTO.setName(name);
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPw());
		System.out.println(memberDTO.getName());
		
		memberService.insertMember(memberDTO);
		
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
