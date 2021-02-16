package com.golgol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.golgol.service.MemberService;

import lombok.extern.java.Log;

@Controller
@Log
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
}
