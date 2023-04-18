package pojoUtility;

public class BookTourPage 
{
	String fromDate;
	String toDate;
	String comments;
	public BookTourPage(String fromDate, String toDate, String comments) 
	{
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.comments = comments;
	}
	public String getFromDate() 
	{
		return fromDate;
	}
	public String getToDate() 
	{
		return toDate;
	}
	public String getComments() 
	{
		return comments;
	}
}