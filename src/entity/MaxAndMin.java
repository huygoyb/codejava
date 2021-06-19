package entity;git

public class MaxAndMin {
    public static void main(String[] args) {
        int number[] = new int[]{1,2,3,4,5,6,7,8,9};
        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i ++){
            if(number[i]< min){
                min = number[i];
            }
            if (number[i]> max){
                max = number[i];
            }
        }
        System.out.println("gia tri lon nhat :" +max);
        System.out.println("gia tri lon nho nhat :" +min);
    }
}
