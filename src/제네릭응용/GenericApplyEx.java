package 제네릭응용;

public class GenericApplyEx
{
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());// Power 타입의 객체를 생성해서 매개변수로 전달
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic);

        //GenericPrinter<Water> waterGenericPrinter = new GenericPrinter<>();
    }
}
