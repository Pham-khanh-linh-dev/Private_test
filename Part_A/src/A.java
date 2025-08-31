public class A {
    public double A1(double[] array){
        double max = array[0];
        double max2 = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] > max){
                max2 = max;
                max = array[i];
            }
        }
        return max2;
    }
    public Boolean checkPalindrome(String str){
        Boolean check = true;
        for(int i = 0;i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                check = false;
                break;
            }
        }
        return check;
    }
    public int giaiThua(int n){
        if( n == 1){
            return 1;
        }
        return n * giaiThua(n-1);
    }

}
