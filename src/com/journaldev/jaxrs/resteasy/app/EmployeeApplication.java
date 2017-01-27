/**
 * 
 */
package com.journaldev.jaxrs.resteasy.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.journaldev.jaxrs.service.EmployeeJsonServiceImpl;
import com.journaldev.jaxrs.service.EmployeeServiceImpl;

/**
 * @author julien.aubert (AUBAY)
 * @date 27 janv. 2017
 * @version 1.0
 */
public class EmployeeApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public EmployeeApplication() {
		singletons.add(new EmployeeServiceImpl());
		singletons.add(new EmployeeJsonServiceImpl());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}