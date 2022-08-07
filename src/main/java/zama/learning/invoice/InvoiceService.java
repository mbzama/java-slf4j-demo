package zama.learning.invoice;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvoiceService {
	private static final Logger log = LoggerFactory.getLogger(InvoiceService.class);
	
	public static List<String> getInvoices(){
		List<String> invoices = Arrays.asList("inv1", "inv2", "inv3");
		log.info("getInvoices: {}", invoices);
		return invoices;
	}
}
