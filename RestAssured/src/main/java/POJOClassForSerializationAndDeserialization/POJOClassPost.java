package POJOClassForSerializationAndDeserialization;

public class POJOClassPost 
{
	String createdBy;
	String projectName;
	String status;
	String teamSize;
	public POJOClassPost(String createdBy, String projectName, String status, String teamSize) 
	{
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	public String getCreatedBy() 
	{
		return createdBy;
	}
	public String getProjectName() 
	{
		return projectName;
	}
	public String getStatus() 
	{
		return status;
	}
	public String getTeamSize() 
	{
		return teamSize;
	}
}
