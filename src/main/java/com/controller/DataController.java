package com.controller;

import com.domain.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据提供Controller
 */
@Controller
@RequestMapping(value = "/charts")
public class DataController {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "getData")
	@ResponseBody
	public List<Point> getData() {
		//TODO:介入动态数据
		//使用jdbcTemplate对象操作数据库
		List<Point> dataList = new ArrayList<Point>();

		String sql = "select * from table where id = ?";


		//使用方法可以搜索JdbcTemplate的使用，这里只是一个例子，我没跑
		jdbcTemplate.query(sql, new RowMapper<Object>() {
			public Object mapRow(ResultSet resultSet, int i) throws SQLException {
				Point point = new Point();
				point.setX(resultSet.getDouble("x"));
				point.setX(resultSet.getDouble("y"));
				point.setId(resultSet.getString("id"));
				return point;
			}
		});


		return dataList;
	}
}
