public class PracticeProblem {

	public static void main(String args[]) {

	}
 public static int sum2D(int[][] num){
	int sum=0;
	for (int[] row: num){
		for (int col: row){
			sum=sum+col;
		}
	}
	return sum;
 }
 public static int sumRow(int[][] num, int row){
	int sum = 0;
	for (int i=0; i< num[row].length; i++){
		sum = sum+ num[row][i];
	}
	return sum;
 }
 public static int sumColumn(int[][] num, int column){
	int sum=0;
	for (int i=0; i<num.length; i++){
		sum = sum+ num[i][column];
	}
	return sum;
 }

 }

