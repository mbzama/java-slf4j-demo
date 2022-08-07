package zama.learning.pr;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrServiceV2 {
	private static final Logger log = LoggerFactory.getLogger(PrServiceV2.class);

	public static List<String> getPRs(){
		List<String> prs = Arrays.asList("pr1", "pr2", "pr3");
		log.info("getPRsV2: {}", prs);
		return prs;
	}
}
