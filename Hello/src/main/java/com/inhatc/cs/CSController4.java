package com.inhatc.cs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CSController4{
	
	
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr) {
		System.out.println("doE doF·Î ÀüÈ¯");
		rttr.addFlashAttribute("mag", "redirected");
		return "redirect:/doF";
	}
	@RequestMapping("doF")
	public void doF(String msg) {
		System.out.println("doF Called........."+msg);
	}
}