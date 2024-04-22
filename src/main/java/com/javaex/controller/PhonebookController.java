package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.util.JsonResult;
import com.javaex.vo.PersonVo;

@RestController
public class PhonebookController {

	@Autowired
	private PhonebookService phonebookService;
	
	@GetMapping("/phonebook")
	public JsonResult list() {
		List<PersonVo> personList = phonebookService.exeList();
		if(personList != null) {
			return JsonResult.success(personList);
		} else {
			return JsonResult.fail("리스트를 불러오는데 실패했습니다.");
		}
	}
}
