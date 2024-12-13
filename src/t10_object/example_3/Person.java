package t10_object.example_3;

import java.util.Arrays;

public class Person {
    public String firstName;
    public String lastName;
    public int[] nums;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nums = new int[]{1,2,3,4};
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nums=" + Arrays.toString(nums) +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Person{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
}
