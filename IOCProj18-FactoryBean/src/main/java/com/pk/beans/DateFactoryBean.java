package com.pk.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date>{
	private int year;
	private int month;
	private int date;
	public DateFactoryBean(int year,int month,int date) {
		System.out.println("DateFactoryBean.DateFactoryBean():3-param constructor");
		this.year=year;
		this.month=month;
		this.date=date;
	}
	@Override
	public Date getObject() throws Exception {
		System.out.println("DateFactoryBean.getObject()");
		return new Date(year,month,date);
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("DateFactoryBean.getObjectType()");
		return Date.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("DateFactoryBean.isSingleton()");
		return true;
	}

	
}
