package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.WaterfallDAO;
import com.model.Waterfall;


@RestController
public class WaterfallController {
		
		@Autowired	//Dependency Injection
		WaterfallDAO waterfallDAO;

		@RequestMapping("/showAllWaterfall")
		public List<Waterfall> showAllWaterfall() {
			List<Waterfall> prodList = waterfallDAO.getAllWaterfall();
			return prodList;
}
}

