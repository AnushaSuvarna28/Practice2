package pojoUtility;

public class CreateTourPage 
{
	String packageName;
	String packageType;
	String packageLocation;
	String packagePrice;
	String packageFeatures;
	String packageDetails;
	public CreateTourPage(String packageName, String packageType, String packageLocation, String packagePrice,String packageFeatures, String packageDetails) 
	{
		this.packageName = packageName;
		this.packageType = packageType;
		this.packageLocation = packageLocation;
		this.packagePrice = packagePrice;
		this.packageFeatures = packageFeatures;
		this.packageDetails = packageDetails;
	}
	public String getPackageName() 
	{
		return packageName;
	}
	public String getPackageType() 
	{
		return packageType;
	}
	public String getPackageLocation() 
	{
		return packageLocation;
	}
	public String getPackagePrice() 
	{
		return packagePrice;
	}
	public String getPackageFeatures() 
	{
		return packageFeatures;
	}
	public String getPackageDetails() 
	{
		return packageDetails;
	}
}
