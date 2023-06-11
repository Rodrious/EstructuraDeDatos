package Semana2;

public class ArrayUnaDimension {

    public static void main(String[] args) {
        int dato = 10;
        int[] nums = {5, 90, 23, 4, 1, 8};

        int[] auxiliar = new int[nums.length + 1];
        auxiliar[0] = dato;

        for (int i = 0; i < nums.length; i++) {
            auxiliar[i + 1] = nums[i];
        }

        nums = auxiliar;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
