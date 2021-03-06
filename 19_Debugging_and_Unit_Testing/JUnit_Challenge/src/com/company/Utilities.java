/*
 *  ==========================================================
 *  Author 	      :      AFGHAN (Piotr Skalski)
 *  Website       :      https://github.com/SkalskiP
 *  Date          :      26.02.18 18:12
 *  Project       :      JUnit_Challenge
 *  ==========================================================
 */

package com.company;

public class Utilities {

    // Returns a char array containing every nth char. where
    // sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n) {
        if(sourceArray == null || sourceArray.length < n) {
            return  sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for(int i = n-1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }

        return result;
    }

    // Remove pairs of the same character that are next
    // to each other, by removing one occurrence of the character
    // "ABBCDEEF" -> "ABCDEF"
    // "ABCBDEEF" -> "ABCBDEF" (the two B's aren't next to each other, so they
    // aren't removed)
    public String removePairs(String source) {

        // If length is less than 2, there won't be any pair
        if (source == null || source.length() < 2) {
            return source;
        }
        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for(int i = 0; i < string.length - 1; i++) {
            if(string[i] != string[i+1]) {
                sb.append(string[i]);
            }
        }

        // add the final character, which is always safe
        sb.append(string[string.length-1]);
        return sb.toString();
    }

    // perform a conversion based on sme internal buissnes rile
    public int converter(int a, int b) {
        return (a/b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if(source.length() % 2 == 0) {
            return source;
        }
        return null;
    }
}
