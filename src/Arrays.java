public class Arrays {

    public int[] nums;

    public static void main(String[] args) {
        System.out.println("welcome to awesome arrays");
        new Arrays();

    }
    public Arrays(){

        nums = new int[10];
        nums[9] = 11;
        nums[8] = 12;
        nums[7] = 321;
        nums[6] = 48;
        nums[5] = 3;
        nums[4] = 34;
        nums[3] = 83;
        nums[2] = 493;
        nums[1] = 829;
        nums[0] = 932;

        for(int x = 0; x < nums.length; x++) {
            nums[x] = (int)(Math.random()* 100)+1;
            System.out.println(nums[x]);
        }
        displayArray();
        sumArray();
        averageNum();
        maxNum();
        minNum();

    }

    public void displayArray(){
        for(int x = 0; x < nums.length; x++){
        System.out.println(x + ": " + nums[x]);
        }
    }

    public void sumArray(){
        int total = 0;
        for(int x = 0; x < nums.length; x++){
            total = total + nums[x];
        }
        System.out.println(total);
    }

    public void averageNum(){
        int avg = 0;
        int total = 0;
        for(int x = 0; x < nums.length; x++){
            total = total + nums[x];
            avg = (total/10);
        }
        System.out.println(avg);
    }

    public void maxNum(){
        int max = nums[0];
        for(int m = 1; m < nums.length; m++){
            if(nums[m] > max){
                max = nums[m];
            }
        }
        System.out.println(max);
    }

    public void minNum(){
        int max = nums[0];
        for(int n = 1; n < nums.length; n++){
            if(nums[n] < max){
                max = nums[n];
            }
        }
        System.out.println(max);
    }


}
