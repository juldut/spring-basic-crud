package com.baeldung.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lab")
public class LabController {
	@GetMapping("/halo")
	public String halo() {
		return("lab/halo");
	}
}
