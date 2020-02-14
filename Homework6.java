//worked and discussed with Yaejin Han
import java.util.Scanner;
public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		String currDir = "+x";
		String none = "No";
		String xPos = "+x";
		String xNeg = "-x";
		String yPos = "+y";
		String yNeg = "-y";
		String zPos = "+z";
		String zNeg = "-z";
		
		for (int i = length - 2; i >= 0; i --) {
			String instrc = sc.next(); 
			if (!instrc.equals(none)) {
				
				if (currDir.equals(xPos)) {
					currDir = instrc;
				} else if (currDir.equals(xNeg)) {
					if (instrc.equals(yPos)) currDir = yNeg;
					else if (instrc.equals(yNeg)) currDir = yPos;
					else if (instrc.equals(zPos)) currDir = zNeg;
					else currDir = zPos;
				} else {
					if (currDir.equals(instrc)) {
						currDir = xNeg;
					} else {
						if ( currDir.indexOf("y") != -1 && instrc.indexOf("y") != -1 ) {
							currDir = xPos;
							
						} else if (currDir.indexOf("z") != -1 && instrc.indexOf("z") != -1)  {
							currDir = xPos;
						}
					}
				}				
			}
		}
		System.out.print(currDir);
	}

}
