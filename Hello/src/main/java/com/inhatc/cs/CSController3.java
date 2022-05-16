package com.inhatc.cs;

import com.inhatc.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.inhatc.domain.ProductVO;

@Controller
public class CSController3{
	
	
	@RequestMapping("doD")
	public String doD(Model model) {
		ProductVO product = new ProductVO("Α¦Η°Έν",10000);
		System.out.println("doD Called~~~~");
		model.addAttribute(product);
		return "productDetail";
	}
}