package com.controller;

import com.domain.Point;
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
	public List<Point> getData() {
		//TODO:介入动态数据
		//现在造假数据
		List<Point> dataList = new ArrayList<Point>();

		Point point1 = new Point(1.0, 2.0 , "p1");
		Point point2 = new Point(1.0, 1.0 , "p1");
		Point point3 = new Point(2.0, 2.0 , "p1");
		Point point4 = new Point(3.0, 2.0 , "p1");
		Point point5 = new Point(4.0, 4.0 , "p1");

		dataList.add(point1);
		dataList.add(point2);
		dataList.add(point3);
		dataList.add(point4);
		dataList.add(point5);

		return dataList;
	}
}
