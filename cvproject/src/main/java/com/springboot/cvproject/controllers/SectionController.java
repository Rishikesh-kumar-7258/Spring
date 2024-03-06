package com.springboot.cvproject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cvproject.modals.Section;

@RestController
public class SectionController {
	
	@GetMapping("/sections")
	public List<Section> GetSections() {
		ArrayList<Section> list = new ArrayList<Section>();
		list.add(new Section("Something"));
		return list;
	}
}
