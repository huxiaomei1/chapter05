package Demo;



public class demo {
    public static void main(String[] args) {
        //多态
        Uncle uncle1 = new UncleOne();
        //用父类的类名接受子类创建的对象，只能调用父类中出现过的方法
        uncle1.fahongbao();
        //uncle1,chouyan(); 不能调用

        UncleOne u1 = (UncleOne) uncle1; //向下转型
        u1.fahongbao();
        u1.chouyan();

        Uncle uncle2 = new UncleTwo(); //向上转型
        uncle2.fahongbao();
    }
}
