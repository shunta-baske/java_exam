package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		List<Member> list = repository.findAll();
		// member.findAll().forEach(System.out::println);
		for (Member member : list) {
			System.out.println(member);
		}

		Member member2 = repository.load(2);
		member2.setName("シロー");
		repository.save(member2);
		System.out.println(member2);
		return "member";
	}

	@RequestMapping("/input")
	public String input() {
		Member member = new Member();
		member.setName("しゅんた");
		member.setAge(26);
		member.setDepId(100);
		repository.save(member);
		return "member";
	}
}
