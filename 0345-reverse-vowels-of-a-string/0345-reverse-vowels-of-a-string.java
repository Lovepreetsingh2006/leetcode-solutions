class Solution {

    boolean checkvow(char a) {
        if (a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u' &&
                a != 'A' && a != 'E' && a != 'I' && a != 'O' && a != 'U') {
            return true;
        } else
            return false;
    }

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (j > i) {

            if (checkvow(arr[i])) {
                i++;
            } else if (checkvow(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        s = String.valueOf(arr);
        return s;
    }
}