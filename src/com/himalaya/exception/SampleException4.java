package com.himalaya.exception;

public class SampleException4 {

    public static void main(String[] args) {
        SampleException4 sample = new SampleException4();
        String phoneNumber = "0101234567";

        try {
            String[] array = sample.strSplit(phoneNumber, 11);

            for (String item : array) {
                System.out.println(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String[] strSplit(String str, int arraySize) throws Exception {

        if (str == null || "".equals(str)) {
            throw new Exception("Null Parameter");
        }

        if (arraySize == 0) {
            throw new ArithmeticException("Can't split with 0");
        }

        if (str.length() < arraySize) {
            throw new IllegalArgumentException("arraySize is larger than str length");
        }

        int unitSize = str.length() / arraySize;
        String[] rt = new String[arraySize];

        int idx = 0;
        for (int i = 0; i < arraySize; i++) {
            rt[i] = str.substring(idx, idx + unitSize);
            idx += unitSize;
        }
        return rt;
    }

}
