package jp.co.fbsc.salessupport.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.fbsc.salessupport.Request;
import jp.co.fbsc.salessupport.model.TOrderManage;
import jp.co.fbsc.salessupport.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public String home(HttpServletRequest servletRequest,Model model,@ModelAttribute("request")Request params,BindingResult bindingResult) {
		
		String method = servletRequest.getMethod();
		System.out.println("search--->" + method);
		List<Object> result = new ArrayList<>();
		List<String> keySearch = new ArrayList<>();
		List<TOrderManage> data = new ArrayList<>();
		keySearch = orderService.keySearch();
		System.out.println("keyseach ----> "+ keySearch.size());
		result.add(keySearch);
		switch (method) {
		case "GET":
			break;
		case "POST":
			 if (bindingResult.hasErrors()) {
		            System.out.println("Lỗi");
		     }
			System.out.println("params ---> "+params);
			if(params.getValue()=="")
				data = orderService.search();
			else
				data = orderService.search(params.getKey(),params.getValue());
			break;
			
		}
		result.add(data);
		System.out.println("Data ---> "+ data.size());
		model.addAttribute("object", result);
		return "index";
	}

//	@GetMapping("/view")
//	public String view(Model model) {
//
//		System.out.println("view");
//		List<TOrderManage> result = orderService.search();
//		System.out.println("Size -----> " + result.size());
//		model.addAttribute("orders", result);
//		return "view";
//	}
}
