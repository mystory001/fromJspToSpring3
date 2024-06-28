package com.mystroy001.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller //@Controller : 주소매핑 파일
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET) 	//@RequestMapping : 자동으로 가상 주소를 뽑아와서 value="/" 비교해서 일치 여부 확인. GET, POST 방식 확인 → 두 개 다 일치하면 아래 메소드가 자동으로 동작
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );//model(자바 request 역할 및 기능. 데이터를 담아서 jsp에 가지고 이동) → jsp에 들고가서 메소드를 사용하지 않고 바로 사용
		
		return "home"; //return "redirect:home"; responseSendRedirect
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "test";
	}
	
}
