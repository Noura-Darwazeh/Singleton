
public class Logger {
	private static Logger instance;
	private Logger() {};
	public static Logger getInstance() {
		if (instance == null)
		{
			instance = new Logger();
		}
		return instance;
		
	}
	
	public void logInformation(String info)
	{
		System.out.println(info);
	}
	
	public void logError(String error)
	{
		System.out.println(error);
	}
}
