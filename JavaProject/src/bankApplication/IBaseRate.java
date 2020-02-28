package bankApplication;

public interface IBaseRate {
	// write a method return the base rate
	
	default double getBaseRate()
	{
		return 2.5;
	}
}
