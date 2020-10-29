import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int samplesize = 0;

		System.out.print("Please enter the sample size: ");
		samplesize = input.nextInt();

		final int NumSamples = samplesize;             
		int[] Array1 = new int[NumSamples];
		int[] Array2 = new int[NumSamples];
		int[] Array3 = new int[NumSamples];
		int[] Array4 = new int[NumSamples];
		int[] SampleArray = new int[NumSamples];
		int[] TotalAll = new int[NumSamples];

		if (samplesize == 0) {
			System.out.println("No data to analyze. Ending program.");
		}
		else 
		{
			int sampleNum1 = 1; int i1 = 0; 
			float total = 0; float total2 = 0; float total3 = 0; float total4 = 0;  


			System.out.println("Enter numbers for Trial 1");

			while (i1 < Array1.length) {
				System.out.print("Enter sample #"+ sampleNum1 + ": ");
				Array1[i1] = input.nextInt();
				total+=Array1[i1];
				++i1;
				++sampleNum1;
			}

			System.out.print("\n");

			int sampleNum2 = 1; 
			int i2 = 0;
			System.out.println("Enter numbers for Trial 2");

			while (i2 < Array2.length) { 
				System.out.print("Enter sample #"+ sampleNum2 + ": ");
				Array2[i2] = input.nextInt();
				total2+=Array2[i2];
				++i2;
				++sampleNum2;
			}

			System.out.print("\n");

			int sampleNum3 = 1; 
			int i3 = 0;
			System.out.println("Enter numbers for Trial 3");
			while (i3 < Array3.length) {
				System.out.print("Enter sample #"+ sampleNum3 + ": ");
				Array3[i3] = input.nextInt();
				total3+=Array3[i3];
				++i3;
				++sampleNum3;
			}

			System.out.print("\n");

			int sampleNum4 = 1; 
			int i4 = 0;
			System.out.println("Enter numbers for Trial 4");	 

			while (i4 < Array4.length) {
				System.out.print("Enter sample #"+ sampleNum4 + ": ");
				Array4[i4] = input.nextInt();
				total4+=Array4[i4];
				++i4;
				++sampleNum4;
			}

			System.out.print("\n");

			for (i1 = 1; i1 < NumSamples; i1++) 
			{
				SampleArray[i1] = SampleArray[i1 - 1] + i1;
			}
			i1 = 1;
			System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");

			for (i1 = 0, sampleNum2 = 0; i1 < NumSamples; i1++, sampleNum2++)
			{
				System.out.println("\t" + (SampleArray[i1] + 1 )+ "\t\t" + Array1[i1] + "\t" + Array2[i1] + "\t" + Array3[i1] + "\t" + Array4[i1]);
			}
			System.out.println("\t--------------------------------------------------");

			float Average1 =0;float Average2 =0;float Average3 =0;float Average4 =0;

			Average1 = total/samplesize;
			Average2 = total2/samplesize;
			Average3 = total3/samplesize;
			Average4 = total4/samplesize;


			System.out.println("\tAverages: \t"+ (float) Average1 + "\t"+ (float) Average2+"\t"+ (float) Average3 +"\t"+ (float) Average4);
			System.out.print("\n");

			final int averages = 4;             
			float[] Avg = new float[averages];
			float[] MinAvg = new float[averages];
			int i;                                 
			float MaxVal; float MinVal = 0;              

			Avg[0] = (float)Average1;
			Avg[1] = (float)Average2;
			Avg[2] = (float)Average3;
			Avg[3] = (float)Average4;

			MaxVal = Avg[0];                   

			for (i = 0; i < averages; ++i) {
				if (Avg[i] > MaxVal) {
					MaxVal = Avg[i];
				}
			}

			MinVal = Avg[0];

			for (i = 0; i < averages; ++i) {
				if (Avg[i] < MinVal) {
					MinVal = Avg[i];
				}
			}

			System.out.println("Min Average: " + MinVal); 
			System.out.println("Max Average: " + MaxVal); 


			System.out.print("\n");

			if ((double)MaxVal == (double)MinVal)
			{
				System.out.println("The trials match EXACTLY!");
			}
			else if ((double)(MaxVal/2) <= (double)MinVal)
			{
				System.out.println("The trials concur with each other!");
			}
			else if ((double)(MaxVal/2) > (double) MinVal){
				System.out.println("The trials do NOT concur!");
			}
		}

	}

}


