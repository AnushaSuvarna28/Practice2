package genericUtility;

public interface EndPointsLibrary 
{
	//Admin Module
	String createTour = "/createTour";
	String updateTour = "/tours/{tour_id}";
	String deleteTour = "/tours/{tour_id}";
	String getAllTours = "/tours";
	
	//Customer Module
	String bookTour = "/bookTour/{tour_name}";
	String viewAllTours = "/allTours";
	String cancelTour = "/myTours/{tour_id}";
	String modifyTour = "/myTours/{tour_id}";
}
