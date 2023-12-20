package in.neuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.neuron.service.StockService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StockUIController {
	
	@Autowired
	private StockService service;
   
	@GetMapping("/")
	public String loadPage() {
		System.out.println("StockUIController loadPage()");
		return "index";
	}
	
	@GetMapping("/getTotalCost")
	public String getTotalCost(HttpServletRequest request, Model model) {
		System.out.println("StockUIController.getTotalCost()");
		
		String companyName=request.getParameter("companyName");
		String quantity=request.getParameter("quantity");
		
		String response=service.getTotalStockPrice(companyName, Integer.parseInt(quantity));
		model.addAttribute("msg", response);
		
		
		return "index";
	}
	
}
