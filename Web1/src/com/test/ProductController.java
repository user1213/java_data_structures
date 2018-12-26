package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.lang.Object;
import java.util.ArrayList;
import java.util.Map;

@Controller
@RequestMapping("/products")
public class ProductController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getName(@PathVariable String name, ModelMap model){
		model.addAttribute("name", name);
		return "getName";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getDefault(ModelMap model){
		model.addAttribute("name", "Default name");
		return "getName";
	}
	
	@RequestMapping(value = {"/div", "/division"}, method = RequestMethod.GET)
	public String getOperation(@RequestParam Map<String, String> allParam, ModelMap model){
		int a = Integer.parseInt(allParam.get("a"));
		int b = Integer.parseInt(allParam.get("b"));
		int c = a / b;
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("c", c);
		return "operation";
	}
	
	@RequestMapping(value = "/addEmp", method = RequestMethod.GET)
	public ModelAndView addEmp(){
		return new ModelAndView("addEmp", "command", new Employee());
	}
	
	@RequestMapping(value = "/postEmp", method = RequestMethod.POST)
	public String postEmp(@ModelAttribute Employee emp, ModelMap model){
		model.addAttribute("name", emp.getName());
		model.addAttribute("company", emp.getCompany());
		model.addAttribute("salary", emp.getSalary());
		return "postEmp";
	}
	
	@RequestMapping(value = "/getEmpDetails", method = RequestMethod.GET)
	public @ResponseBody ArrayList<Employee> getEmpDetails(){
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setName("John");
		e1.setCompany("Google");
		e1.setSalary(400000);
		empList.add(e1);
		return empList;
	}
}
