package com.mkyong.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.mkyong.model.Hosting;

@Service
public class HostingDaoImpl implements HostingDao {

	@Autowired
	private MongoOperations mongoOperation;

	@Override
	public void save(Hosting hosting) {
		mongoOperation.save(hosting);
	}

}