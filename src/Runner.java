public class Runner {
    public static void main(String[] args)
    {
        CodeWordChecker newChcker = new CodeWordChecker(1,20,"carrot");
        String str1 = "carrotCake";
        String str2 = "cake";
        String str3 = "kono dio da";
        System.out.println(newChecker.isValid(str1));
        System.out.println(newChecker.isValid(str2));
        System.out.println(newChecker.isValid(str3));

    }
}