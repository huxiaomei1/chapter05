package Demo;

/**
 * @author huxiaomei
 * @date 2021/4/25 17:30
 */
public class demo01 {

        public static void main(String[] args) {
            Uncle uncle1 = new UncleOne();
            Uncle uncle2 = new UncleTwo();
            if ( uncle1 instanceof UncleOne ) {
                UncleOne u1 = (UncleOne)uncle1;
                u1.fahongbao();
            }
            if (uncle2 instanceof UncleTwo ){
                UncleTwo u2 = (UncleTwo) uncle2;
                u2.fahongbao();
            }
        }

}
