package com.start.pratice;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoProductController {

	@RequestMapping(value = "/product-input-form")
	public String inputProduct(Model model) {
		model.addAttribute("product", new Product());
		return "productForm";
	}

	@RequestMapping(value = "/save-product", method = RequestMethod.POST)
	public String uploadResources(HttpServletRequest servletRequest, @ModelAttribute Product product, Model model)
			throws IllegalStateException, IOException {

		String filepath = "/home/rajesh/Documents/Uploads";
		product.getFile().transferTo(new File(filepath));
		model.addAttribute("product", product);
		return "viewProductDetail";
	}

}