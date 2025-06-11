public class Count1 {
    public static void main(String[] args) {
        String sentence = "you are welcome";
        StringBuilder  result = new StringBuilder();

        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);

            if(ch == 'a'){
                result.append('b');
            } else if (ch == 'e') {
                result.append('f');

            }else if(ch == 'i'){
                result.append('j');
            }else if(ch == 'o'){
                result.append('p');
            } else if (ch == 'u') {
                result.append('v');

            }else{
                result.append(ch);
            }
        }
        System.out.println("the count is:" +result.toString());
    }
}
