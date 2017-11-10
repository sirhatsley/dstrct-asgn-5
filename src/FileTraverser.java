
import java.io.File;

/**

Contains methods that traverses a file structure recursively to find files

@author Tim Callies, Jacob Wiggins




*/

public class FileTraverser{
	
	/**
	recursively finds and prints the path and file name of all files with the given file name rooted at the given directory.
	
	@param filePath  the path of the root directory.
	@param fileName  the name of the file to be found and printed
	
	*/
	public static void find(String filePath, String fileName)
	{
		File path = new File(filePath);
		if (!path.isDirectory())
		{
			throw new IllegalArgumentException(
				filePath + " is not a directory.");
		}
		String[] files = path.list();
		if (files!=null)
		{
			for(int i=0;i<files.length;i++)
			{
				//System.out.println(files[i]);
				if (new File(filePath+"\\"+files[i]).isDirectory())
				{
					find(filePath+"\\"+files[i],fileName);
				}
				if (files[i].equals(fileName))
				{
					System.out.println(filePath+"\\"+fileName);
				}
			}
		}
	}//find
	
	/*
	recursively finds and prints the total disk usage of every file and directory in the file system rooted at the given path.
	
	@param filePath  the path of the root directory	
	
	*/
	public static void usage(String filePath)
	{
		//THIS IS A PRACTICE PROBLEM
	}//usage
	
	
}