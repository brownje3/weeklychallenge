public class PronicHappy {
    public static void main(String[] a){
        System.out.println("is 42 heteromecic?: " + isPronic(42));
        System.out.println("is 320 happy: " + isHappy(320));
    }

    static boolean isPronic(int n){

        if(n % 2 != 0){
            return false;
        }

        if (n == 0){return true;}

        for (int o = 1; o < n; o++) {
            if (o*(o + 1) == n){
                return true;
            }
        }

        return false;
    }

    static boolean isHappy(Integer i){
        if(i == 0){return true;}

        String s = i.toString();
        int sum = 0;
        int temp = 0;

        for (Character a : s.toCharArray()) {
            temp = Integer.parseInt(a.toString());
            sum += temp * temp;
        }
        System.out.print(sum + " ");
        if (sum == 4){return false;}
        if (sum == 1){return true;}
        return isHappy(sum);
    }
}
