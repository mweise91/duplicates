public class Main {

    //Complexity O(n^2)
    private static char returnDuplicate(String str){
       for(int i = 0; i < str.length(); i++){
           for (int j = 1; j < str.length(); j++){
               if (str.charAt(i) == str.charAt(j)){
                   return  str.charAt(i);
               }
           }
       }

       return 0;
    }

    public static void main(String[] args) {
        System.out.println(returnDuplicate("Geeksforjaam"));
    }
}
