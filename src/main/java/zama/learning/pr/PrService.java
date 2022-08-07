package zama.learning.pr;

import java.util.Arrays;
import java.util.List;

import javax.naming.directory.InvalidAttributesException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrService {
	private static final Logger log = LoggerFactory.getLogger(PrService.class);

	public static List<String> getPRs(Integer count){
		List<String> prs = null;
		try {
			if(count % 2 == 0) {
				throw new InvalidAttributesException("Invalid PR");
			}
			
			prs = Arrays.asList("pr1", "pr2", "pr3");
			log.info("getPRs: {}", prs);
		} catch (Exception e) {
			log.error("Error: {}", e);
		}
		return prs;
	}
}
