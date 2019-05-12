package com.springbootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //注意不能使用@RestController(无视图层),否则无法找到对应的jsp页面
public class JspController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";//对应jsp文件名称即index.jsp
	}

}
