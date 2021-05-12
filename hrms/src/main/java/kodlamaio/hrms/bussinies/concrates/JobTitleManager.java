package kodlamaio.hrms.bussinies.concrates;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.bussinies.abstracts.JobTitleService;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concrates.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
private JobTitleDao jobTitleDao;


	public JobTitleManager(JobTitleDao jobTitleDao) {
	super();
	this.jobTitleDao = jobTitleDao;
}


	@Override
	public List<JobTitle> getAll() {
	
		return this.jobTitleDao.findAll();
	}

	

}
