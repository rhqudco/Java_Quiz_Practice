class Product {

    String prdNo;
    String prdName;
    int prdPrice;
    int prdYear;
    String prdMaker;

    Product(String prdNo,
            String prdName,
            int prdPrice,
            int prdYear,
            String prdMaker) {

        this.prdNo = prdNo;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdYear = prdYear;
        this. prdMaker = prdMaker;

    }

    @Override
    public String toString() {
        return  prdNo + "   " +  prdName + "    " + prdPrice + "    " + prdYear + " " + prdMaker;
    }

}
public class ProductTest {
    public static void main(String[] args) {
       Product pd1 = new Product("001", "   노트북", 1200000,
               2021, "   삼성");
        Product pd2 = new Product("002", "   모니터 ", 300000,
                2021, "   LG");
        Product pd3 = new Product("003", "   마우스  ", 30000,
                2020, "   로지텍");

        System.out.println("상품번호   상품명      가격      연도    제조사");
        System.out.println("---------------------------------------");
        System.out.println(pd1.toString());
        System.out.println(pd2.toString());
        System.out.println(pd3.toString());
    }
}
