package fit.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	public String displaycompanyform(Map<String, Object> model) {
			model.put("company",new Company());
		    List<String> citylist = new ArrayList<>();
		    citylist.add("Hyderbad");
		    citylist.add("Chennai");
		    citylist.add("USA");
	        model.put("citylist", citylist);
	        return "company";
		//return new ModelAndView("company","command",new Company());
	}
	
	
	@RequestMapping(value="/savecompany",method=RequestMethod.POST)
	public String savecompnay(@ModelAttribute Company company,Model model) {
		model.addAttribute("cname",cservice.getUpper(company.getCname()));
		model.addAttribute("caddr", company.getCaddr());
		model.addAttribute("city", company.getCity());
		return "companydisplay";
	}
	

}
