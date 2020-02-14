import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int months, numOfDep;
		double downp, loan;
		
		months = scnr.nextInt();
		downp = scnr.nextDouble();
		loan = scnr.nextDouble();
		numOfDep = scnr.nextInt();

		double[] depr = new double[months+1];
		
		int currIndex;
		double currVal;
		int j = 0;
		for (int i = 0; i < numOfDep; i ++) {
			currIndex = scnr.nextInt();
			currVal = scnr.nextDouble();
			
			depr[currIndex] = currVal;
			
			while (j < currIndex & depr[j] == 0) {
				depr[j] = depr[j-1];
				j += 1;
			}
			j += 1;
			if (i+1 == numOfDep && currIndex < depr.length - 1) {
				int remIndex = currIndex + 1;
				while (remIndex < depr.length) {
					depr[remIndex] = currVal;
					remIndex +=1;
				}
			}
		}
		
		scnr.close();
						
		int numMonths = 0;
		double recVal = (loan + downp) * (1-depr[numMonths]);
		double monthlyP = loan / months;
		
		while (loan > recVal) {
			numMonths ++;
			loan -= monthlyP;
			recVal = recVal * (1-depr[numMonths]);
		}
		
		if (numMonths == 1) {
			System.out.println(numMonths + " month");
		} else {
			System.out.println(numMonths + " months");
		}
		
	}

}
