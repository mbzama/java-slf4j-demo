package org.zama.test1;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComTestService {
	private static final Logger log = LoggerFactory.getLogger(ComTestService.class);
	
	public static List<String> comTest(){
		List<String> payments = Arrays.asList("payment1", "payment2", "payment3");
		log.info("comTest: {}", payments);
		return payments;
	}
}
