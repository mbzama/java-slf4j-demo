package zama.learning.reports;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportService {
	private static final Logger log = LoggerFactory.getLogger(ReportService.class);

	public static List<String> getReports(){
		List<String> rpts = Arrays.asList("rpt1", "rpt1", "rpt1");
		log.info("getReports: {}", rpts);
		return rpts;
	}
}
