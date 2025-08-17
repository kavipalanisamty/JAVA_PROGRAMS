public class ReverseWord{
    public static String PrintResult(String str)
    {
        String temp = "";
        String result = "";

        int left = 0;
        int right = str.length()-1;

        while(left <= right)
        {
            char ch = str.charAt(left);
            if(ch != ' ')
            {
                temp += ch;
            }
            else if(ch == ' ')
            {
                if(!result.equals(""))
                {
                    result = temp + " " + result;
                }
                else 
                {
                    result = temp;
                }
                temp = "";
            }
            left++;

        }

        if(!temp.equals(""))
        {
            if(!result.equals(""))
            {
                result = temp + " " + result;
            }
            else
            {
                result = temp;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("Before Reversing");
        String str = "TUF is great for interview preparation";
        System.out.println(str);
        System.out.println("After Reversing");
        System.out.println(PrintResult(str));
    }
}