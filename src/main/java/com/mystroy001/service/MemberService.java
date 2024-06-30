package com.mystroy001.service;

import java.sql.Timestamp;

import javax.inject.Inject;

import com.mystroy001.dao.MemberDAO;
import com.mystroy001.domain.MemberDTO;

public class MemberService {//처리작업

	//MemberDAO 객체 생성 → 멤버 변수
//	MemberDAO memberDAO = new MemberDAO();
	private MemberDAO memberDAO;
	
	//set메소드 정의
	@Inject
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public void insertMember(MemberDTO memberDTO) {
		System.out.println("MemberService insertMember()");
		//가입날짜 설정
		memberDTO.setDate(new Timestamp(System.currentTimeMillis()));
		System.out.println(memberDTO.getDate());
		memberDAO.insertMember(memberDTO);
	} 

}
