package Training;

abstract class SumDiff{
	int sum(int i, int j){
		return i+j;
	}
	int diff(int i, int j){
		return i-j;
	}
}

public class SumDiffMult extends SumDiff {
	
	int mult(int i, int j){
		return  i*j;
	}
	public static void main(String[] args) {
		SumDiffMult sdm = new SumDiffMult();
		int num1 = 100, num2 = 45;
		int sum = sdm.sum(num1, num2);
		int diff = sdm.diff(num1, num2);
		int mult = sdm.mult(num1, num2);
		System.out.println(sum + "\n"+ diff + "\n" + mult);
	}

}
