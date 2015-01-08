package com.mkyong.common.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mkyong.common.model.Shop;

@RestController
public class JSONController {

	@RequestMapping(value = "test",  
            method=RequestMethod.GET,produces={"application/xml", "application/json"})
	public  Shop getShopInJSON() {

		System.out.println(12);
		Shop shop = new Shop();
		shop.setName("hehe");
		List<Shop> shops=new ArrayList();
		shops.add(shop);
		return shop;
	}

}