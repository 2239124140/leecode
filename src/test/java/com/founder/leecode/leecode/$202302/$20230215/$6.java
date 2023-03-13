package com.founder.leecode.leecode.$202302.$20230215;

public class $6 {


    public static int name(String centent ,String word) {
        char wordFirst = word.charAt(0);
        int wordLength = word.length();
        int cententLength = centent.length();
        int count = 0 ;
        for (int i = 0; i <= cententLength-wordLength; i++) {
            char cur = centent.charAt(i);
            if(wordFirst!=cur){
                continue;
            }
            int  wordIndex = 0 ;
            for (int j = 0; j < wordLength; j++) {
                if(centent.charAt(i+j)==word.charAt(j)){
                    wordIndex++;
                }
            }
            if(wordIndex==wordLength){
                count++;
            }
        }
        for (int i = centent.length()-1; i >= wordLength-1 ; i--) {
            char cur = centent.charAt(i);
            if(wordFirst!=cur){
                continue;
            }
            int  wordIndex = 0 ;
            for (int j = 0; j < wordLength; j++) {
                if(centent.charAt(i-j)==word.charAt(j)){
                    wordIndex++;
                }
            }
            if(wordIndex==wordLength){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String centent = in.nextLine();
//        String word = in.nextLine();

        System.out.println(name("ababa", "ab"));
    }
}
