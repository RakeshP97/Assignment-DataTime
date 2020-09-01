package com.example.demo.dao;

import com.example.demo.data.Application;

public interface DateTimeDao{
	
	/**
	 * Create and persist new application object into NoSql DB
	 * 
	 * @return Application
	 **/
	public Application persistDataTime();

}
