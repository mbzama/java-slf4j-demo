package com.zama.test1;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrgTestService {
	private static final Logger log = LoggerFactory.getLogger(OrgTestService.class);
	
	public static List<String> orgTestService(){
		List<String> payments = Arrays.asList("payment1", "payment2", "payment3");
		log.info("OrgTestService: {}", payments);
		return payments;
	}
}
