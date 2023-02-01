package Arrays1D;

public class ArrayAddition {
    public static void main(String[] args) {
        int x[] = {3,2,5,6};
        int y[] = {2,7,2,7};
        int x_len = x.length;
        int y_len = y.length;
        int n = x_len > y_len ? x_len : y_len;
        int z[] = new int[n];
        int i = x.length - 1;
        int j = y.length - 1;
        int k = z.length - 1;
        int carry = 0;
        int sum = 0;
        while(k >= 0) {
            if(i >= 0 && j >= 0) {
                sum = x[i] + y[j] + carry;
            }
            else if(i >= 0 && j < 0) {
                sum = x[i] + carry;
            }
            else if(i < 0 && j >= 0) {
                sum = y[j] + carry;
            }

            carry = sum / 10;
            sum = sum % 10;

            z[k] = sum;
            i--;
            j--;
            k--;
        }

        if(carry != 0) {
            System.out.println(carry);
        }
        for(int e : z) {
            System.out.print(e);
        }

    }
}
