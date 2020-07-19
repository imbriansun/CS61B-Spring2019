public class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    if (n == 0 || a.length == 0 || a.length == 1){
    	return;
    }

    for(int i = 0; i < a.length - 1; i++){
	    int tmp = a[i];
    	for(int j = i + 1; (j <= i + n && j < a.length); j++){
		if(tmp >= 0){
			a[i] += a[j];
		}else{
			break;
		}
	}
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}
