public class TinhLaiXuatKep {
    public void calculator( int p,int t, double r, int n){
        double amount = p*Math.pow(1+(r/n),n*t);
        double cinterest = amount - p;
        System.out.println("Số tiền có được sau" +t+ "năm là" +cinterest);
        System.out.println("tổng số tiền có được sau" +t+ "năm là"  +amount);
    }
    public static void main(String[] args) {
        TinhLaiXuatKep obj = new TinhLaiXuatKep();
        obj.calculator(8000, 5, 0.08, 12);
    }
}
