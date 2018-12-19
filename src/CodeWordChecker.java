public class CodeWordChecker implements StringCheck{
    private String code;
    private int min,max;
    public CodeWordChecker(int min, int max, String code)
    {
        this.min = min;
        this.max = max;
        this.code = code;
    }
    public CodeWordChecker(String code)
    {
        this.code = code;
    }
    public boolean isValid(String word)
    {
        return((word.length() <= this.max) && (word.length() >= this.min) && (word.indexOf(this.code) >=0));
    }
}
