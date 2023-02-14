package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.HoneyMoonDAO;
import com.model.Beach;
import com.model.HoneyMoon;

@RestController
public class HoneyMoonController {

	@Autowired	//Dependency Injection
	HoneyMoonDAO honeymoondao;

	@GetMapping("/showAllHoneyMoon")
	public List<HoneyMoon> showAllHoneyMoon() {
		List<HoneyMoon> prodList = honeymoondao.getAllHoneyMoon();
		return prodList;
	}
	@PostMapping("/registerHoneyMoon")
	public String registerHoneyMoon(@RequestBody HoneyMoon honeymoon){
		
		HoneyMoon h = honeymoondao.register(honeymoon);

		if ( h.getHmId()!=-1 && h != null)
			return "Registration success";

		return "Registration Failed!!!";
	}
	
	@PutMapping("/updateHoneyMoon")
	public String updateHoneyMoon(@RequestBody HoneyMoon honeymoon){

		HoneyMoon h= honeymoondao.updateProduct(honeymoon);

		if (h.getHmId()!=-1 && h != null)
			return "Updated success";

		return "Updation Failed!!!";
	}

	@DeleteMapping("/deleteHoneyMoon/{prodId}")
	public String deleteHoneyMoon(@PathVariable("prodId") int prodId) {
		honeymoondao.deleteProduct(prodId);
		return "Product(" + prodId + ") Record Deleted Successfully!";
	}
}
