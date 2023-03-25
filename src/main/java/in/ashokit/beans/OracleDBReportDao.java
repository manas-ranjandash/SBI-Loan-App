package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracledao")
@Primary
public class OracleDBReportDao implements ReportDao {
	public void getData() {
		System.out.println("Getting Data From Oracle db...");
	}

}
