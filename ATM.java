public class ATM {
    public int countBanknotes(int sum){
        int[] banknotes ={500, 200, 100, 50, 20, 10, 5, 2, 1};
        int result =0;
        int l=banknotes.length;
        int k=0;
        while (k< banknotes.length){
            int b=banknotes[k];

            if (sum>=b) {
            int Banknotesqty = sum/b;
            result += Banknotesqty;
            sum=sum-Banknotesqty*b;
            }
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        ATM counter=new ATM();
        System.out.println(counter.countBanknotes(578));
    }
}