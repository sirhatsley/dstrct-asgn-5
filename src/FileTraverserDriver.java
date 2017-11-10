/*

Tests the FileTraverser class methods

@author Tim Callies, Jacob Wiggins

*/
public class FileTraverserDriver{
	
	public static void main(String[] args){
		
		//TEST 1
		String path = "C:\\Users\\Tim\\Music";
		String target = "Still Alive.mp3";
		System.out.println("Expected: C:\\Users\\Tim\\Music\\iTunes\\iTunes Media\\Music\\Portal\\Unknown AlbumStill Alive.mp3");
		System.out.print("Actual: ");
		FileTraverser.find(path, target);
		//Looks for a single file, and prints its directory
		
		
		path = "C:\\Users";
		target = "readme.txt";
		FileTraverser.find(path, target);
		//Takes forever, returns basically every readme on your computer.
		
		
		/*
		Note, I won't be able to run your driver since I don't have your file structure.  So, make sure to include
		a brief description of what each test cases is testing for.
		*/
		
	}//main
	
	
}//class