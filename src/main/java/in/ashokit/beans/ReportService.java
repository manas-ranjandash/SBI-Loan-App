package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	private ReportDao dao;
	
	@Autowired
	public ReportService(ReportDao dao) {
		System.out.println("Constructor...level...");
		this.dao = dao;
	}

	public void generateReport() {
		dao.getData();
		System.out.println("Report generated.....");
	}

}
