
package GenericUtility;

public interface EndPointsLibrary 
{
	String createProject = "/addProject";
	String updateProject = "/projects/{projectId}";
	String getAllProject = "/projects";
	String getSingleProject = "/projects/{projectId}";
	String deleteProject = "/projects/{projectId}";
}
