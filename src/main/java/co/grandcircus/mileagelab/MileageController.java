package co.grandcircus.mileagelab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageController {
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView("mileage-index");
		return mav;
	}
	@RequestMapping("/mileage-form")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("mileage-form");
		return mav;
	}

	@RequestMapping("/mileage-result")
	public ModelAndView showResult(
			@RequestParam("mpg") double mileage, 
			@RequestParam("gallons") double gallons
			) {
		ModelAndView mav = new ModelAndView("mileage-return");
		
		double result = mileage*gallons;
		mav.addObject("mpg",mileage);
		mav.addObject("gallons",gallons);
		mav.addObject("result", result);
		return mav;
	}

}

