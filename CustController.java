package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Customer1;
import com.web.repo.CustRepo;
@Controller
public class CustController {

	
		@Autowired
		private CustRepo repo;
		
		@RequestMapping("/")
		public String home() {
			
			return "home";
		}

		@RequestMapping(value="/req1", method=RequestMethod.POST)
		public String saveCust(@RequestParam int cid,
				@RequestParam String cname,
				@RequestParam String mobileno,
				@RequestParam String pname,
				@RequestParam double price,
				@RequestParam double qty,Customer1 cust,Model model)
	
		{
			
			
	 double total=0.0,discount=0.0,gstamt=0.0,invoicebill=0.0;
	 
	 total=cust.getPrice()*cust.getQty();
	 cust.setTotal(total);
	 if(total<2500)
	 {
		 discount=(total*10)/100;
		 
	 }
	 else if(total>=2500&&total<5000)
	 {
		 
		 discount=(total*15)/100;
		 
	 }
	 else if(total>=5000)
	 {
		 discount=(total*30)/100;
		 
	 }
	 cust.setDiscount(discount);
	 cust.setGstamt(gstamt);
	 gstamt=(total*18)/100;
	 cust.setGstamt(gstamt);
		invoicebill=total+gstamt;
		cust.setInvoicebill(invoicebill);		
	 repo.save(cust);
	 model.addAttribute("Customer1",repo.findAll());
	 return "result";
			
		}
		
		
		@RequestMapping(value="/delete/{cid}",
	    		method=RequestMethod.GET)
	    public String deleteUser(@PathVariable int cid)
	    {
	    	repo.deleteById(cid);
	    	 return "delete"; 
	    }

		@RequestMapping(value="/update/{cid}")
	    public String edit(@PathVariable int cid,Model m)
	    {
	    	Customer1 user=repo.findById(cid).get();
	    m.addAttribute("command", user);
	    	repo.findById(cid);
	    	 return "update"; 
	    }
	    @RequestMapping(value="/updateu",method=RequestMethod.POST)
	    public String editsave(@RequestParam int cid,
				@RequestParam String cname,
				@RequestParam String mobileno,
				@RequestParam String pname,
				@RequestParam double price,
				@RequestParam double qty,Customer1 cust,Model model)
	    {
	    	double total=0.0,discount=0.0,gstamt=0.0,invoicebill=0.0;
	   	 
	   	 total=cust.getPrice()*cust.getQty();
	   	 cust.setTotal(total);
	   	 if(total<2500)
	   	 {
	   		 discount=(total*10)/100;
	   		 
	   	 }
	   	 else if(total>=2500&&total<5000)
	   	 {
	   		 
	   		 discount=(total*15)/100;
	   		 
	   	 }
	   	 else if(total>=5000)
	   	 {
	   		 discount=(total*30)/100;
	   		 
	   	 }
	   	 cust.setDiscount(discount);
	   	 cust.setGstamt(gstamt);
	   	 gstamt=(total*18)/100;
	   		invoicebill=total+gstamt;
	   		
	    	repo.save(cust);
	    	
	    	return "success";    	
	    }
	    
		 
		
		
		
		
	}
	
	
	
		
		
		

		
		
		



