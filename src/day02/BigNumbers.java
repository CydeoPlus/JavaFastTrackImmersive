package day02;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger("45634562353245236543353452462435345234");
        BigInteger bigInt2 = new BigInteger("1000234234234523452345226456456435634564536");

        BigInteger sum = bigInt.add(bigInt2);
        BigInteger diff = bigInt.subtract(bigInt2);
        System.out.println("sum = " + sum);
        System.out.println("diff = " + diff);

        byte[] nums1 = {3,5,4,6,6,7,3,45,67,67,34,3,2,3,5,45,56,7,55,34,32,23,2,54,6,56,34,44};
        byte[] nums2 = {65,34,46,56,34,6,5,23,45,56,42,45,56,43,54,35,56,45};

        BigInteger nums1BigInt = new BigInteger(nums1);
        BigInteger nums2BigInt = new BigInteger(nums2);

        System.out.println(nums1BigInt.add(nums2BigInt));
        System.out.println(nums1BigInt.multiply(nums2BigInt));
        System.out.println(nums1BigInt.compareTo(nums2BigInt));

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        String str = "dsfkhafsdhfkjkjsdhfkjh334534jkhsdkfjhsdfkjsdhkfj345345jhsdkljhfsdkjfheklj43k5j34klj5h34k5hskjfhskljfhkjdhkjshfkjlshfkjh345345j34h5klhsdfkljhsdfkjeklj34hk534";
        String str2 = new String("java");
    }
}
