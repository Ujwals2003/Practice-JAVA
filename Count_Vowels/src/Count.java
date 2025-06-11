public class Count {
    public static void main(String[] args) {
        String sentence = "Today is my day, i will do best";
        sentence = sentence.toLowerCase();

        int vowel_Count = 0;
        int coonsonants_Count = 0;

        for(int i = 0; i < sentence.length(); i++)
        {
           char ch = sentence.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel_Count++;
            }else if ((ch >= 'a' && ch <= 'z')) {
                coonsonants_Count++;
            }
            System.out.println( vowel_Count);
            System.out.println(coonsonants_Count);

        }
    }
}
