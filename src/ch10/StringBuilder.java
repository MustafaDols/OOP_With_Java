package ch10;

public class StringBuilder {
        public static void main(String[] args) {
            System.out.println(duplicate("introduction to java",'a'));
            int arr[] =  {1,0,3,2,4};
            System.out.println(construct(arr));
        }
        public static java.lang.StringBuilder duplicate(String text , char c){
            java.lang.StringBuilder s = new java.lang.StringBuilder();
            for (int i=0 ; i < text.length() ; i++ ){
                s.append(text.charAt(i));
                if(text.charAt(i)==c)
                    s.append(c);
            }
            return s;
        }

        public static java.lang.StringBuilder construct(int [] arr){
            java.lang.StringBuilder s = new java.lang.StringBuilder();
            char[] c = {'a','b','c','d','e'};
            for (int i=0 ; i < arr.length ; i++){
                for (int j=0 ; j < arr[i] ; j++){
                    s.append(c[i]);
                }
            }
            return s;
        }
    }


