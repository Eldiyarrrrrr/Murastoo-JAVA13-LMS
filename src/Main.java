public class Main {
    public static void main(String[] args) {

        Person parent = new Person("Beknazar","Joldoshbekov");
        System.out.println(parent);

        Dancer boy = new Dancer("SultanAli","Kaldarbek",20,"yellow");

        System.out.println(boy);

        Programmer girl = new Programmer("Bektur","Temirbekov",20,"white","rabochka",2);
        System.out.println(girl);

        Singer singer =new Singer("Eldiyar","Avazbekov","Baha","Name");
        System.out.println(singer);
    }
}
