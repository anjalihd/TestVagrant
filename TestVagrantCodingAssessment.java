package seleniumscripspackage;

import java.util.Scanner;

public class TestVagrantCodingAssessment {
	static String s1= "Song 1";
	static String s2= "Song 2";
	static String s3= "Song 3";
	static String s4= "Song 4";
	static int song;
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(song<=4) {
			
		
		System.out.println("Select the songs from [1-4]");
		song= sc.nextInt();
		
		switch (song) {
		case 1:
			System.out.println("Now playing= "+s1);
			System.out.println("Next playing in the playlist "+'\n'+"next = "+s4+'\n'+"Later = "+s2);
			break;

		case 2:
			System.out.println("Now playing= "+s2);
			System.out.println("Next playing in the playlist "+'\n'+"next = "+s3+'\n'+"Later = "+s4);
			break;
			
		case 3:
			System.out.println("Now playing= "+s3);
			System.out.println("Next playing in the playlist "+'\n'+"next = "+s1+'\n'+"Later = "+s2);
			break;
			
		case 4:
			System.out.println("Now playing= "+s4);
			System.out.println("Next playing in the playlist "+'\n'+"next = "+s2+'\n'+"Later = "+s3);
			break;
		default:
			System.out.println("Not in the List");
			break;
		}

	}

}
}