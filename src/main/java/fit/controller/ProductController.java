package fit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fit.bean.Company;
import fit.service.CompanyService;

@Controller
public class ProductController {
	
	@Autowired
	CompanyService cservice;
	
	@RequestMapping(value="/company",method=RequestMethod.GET)
	public ModelAndView displaycompanyform() {
		return new ModelAndView("company","command",new Company());
	}
	
	
	@RequestMapping(value="/savecompany",method=RequestMethod.POST)
	public String savecompnay(@ModelAttribute Company company,Model model) {
		model.addAttribute("cname",cservice.getUpper(company.getCname()));
		model.addAttribute("caddr", company.getCaddr());
		return "companydisplay";
	}
	

}
