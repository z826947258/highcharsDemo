package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据提供Controller
 */
@Controller
@RequestMapping(value = "/charts")
public class DataController {
	@RequestMapping(value = "getData")
	@ResponseBody
	public List<List<Double>> getData() {
		//TODO:介入动态数据
		//现在造假数据
		List<List<Double>> dataList = new ArrayList<List<Double>>();

		List<Double> list1 = new ArrayList<Double>();
		list1.add(161.2);
		list1.add(51.6);

		List<Double> list2 = new ArrayList<Double>();
		list2.add(167.5);
		list2.add(59.0);

		List<Double> list3 = new ArrayList<Double>();
		list3.add(159.5);
		list3.add(49.2);

		List<Double> list4 = new ArrayList<Double>();
		list4.add(157.0);
		list4.add(63.0);

		List<Double> list5 = new ArrayList<Double>();
		list5.add(155.8);
		list5.add(53.6);

		dataList.add(list1);
		dataList.add(list2);
		dataList.add(list3);
		dataList.add(list4);
		dataList.add(list5);

		return dataList;
	}
}
