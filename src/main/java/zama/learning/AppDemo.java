package zama.learning;

import org.zama.test1.ComTestService;

import com.zama.test1.OrgTestService;

import zama.learning.invoice.InvoiceService;
import zama.learning.payment.PaymentService;
import zama.learning.pr.PrService;
import zama.learning.pr.PrServiceV2;
import zama.learning.reports.ReportService;

public class AppDemo {
	private static Integer count = 0;

	public static void main(String[] args) throws InterruptedException {
		while(true) {
			ComTestService.comTest();
			OrgTestService.orgTestService();
			PaymentService.getPayments();
			InvoiceService.getInvoices();
			ReportService.getReports();
			PrService.getPRs(count);
			PrServiceV2.getPRs();

			count++;
			Thread.sleep(12000);
		}
	}
}
