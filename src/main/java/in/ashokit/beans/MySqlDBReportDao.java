package in.ashokit.beans;

import org.springframework.stereotype.Repository;

@Repository("mysqldao")
public class MySqlDBReportDao implements ReportDao {
	public void getData() {
		System.out.println("getting Data form mySql db....");
	}

}
