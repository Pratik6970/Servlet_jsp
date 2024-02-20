package sunbeam.beans;

import java.util.ArrayList;
import java.util.List;

import dao.BookDao;

public class SubjectBean {
	
	private List<String>subjectList;
	
	public SubjectBean()
	{
		this.subjectList=new ArrayList<>();
	}

	public List<String> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<String> subjectList) {
		this.subjectList = subjectList;
	}
	
	public void fetchSubjects()
	{
		try(BookDao dao = new BookDao()){
			subjectList=dao.getSubject_name();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
