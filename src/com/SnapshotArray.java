package com;

import java.util.LinkedList;
import java.util.List;

public class SnapshotArray {
    public SnapshotArray(int length) {
        int[] arr = new int[length];
    }

    public void set(int index, int val) {

    }

    public int snap() {

    }

    public int get(int index, int snap_id) {

    }

    public boolean isPerfectSquare(int num) {
        for (int i = 1;i<=num;i++){
            if (i*i == num){
                return true;
            }
        }
        return false;
    }
    public String reformat(String s) {
        LinkedList<Character> lsalpha = new LinkedList<Character>();
        LinkedList<Character> lssymbol = new LinkedList<Character>();

        for (int i = 0;i<s.length();i++){
            int ascii = (int) s.charAt(i);
            if (ascii>=97 && ascii<=122){
                lsalpha.add(s.charAt(i));
            }else {
                lssymbol.add(s.charAt(i));
            }
        }
        System.out.println(lsalpha);
        System.out.println(lssymbol);
        String ans = "";
        if ( lsalpha.size() == lssymbol.size()+1 || lssymbol.size() == lsalpha.size()+1 || lsalpha.size() == lssymbol.size()){
            int len = s.length();
            int j =0;
            for (int i = 0;i<len;i++){
                if (lsalpha.size()<lssymbol.size() && i == 0){
                    ans += lssymbol.getFirst();
                }
                if (j<=lsalpha.size() && j<=lssymbol.size()) {
                    System.out.println(j);
                    if (j<lsalpha.size()) {
                        ans += lsalpha.get(j);
                    }
                    if (j<lssymbol.size() && lsalpha.size()>=lssymbol.size()) {
                        ans += lssymbol.get(j);
                    }

                    if (j<lssymbol.size()-1 && lsalpha.size()<lssymbol.size()) {
                        ans += lssymbol.get(j+1);
                    }
                    j++;
                }
                if (lsalpha.size()>lssymbol.size() && i == len-1){
                    ans += lsalpha.getLast();
                }
            }
            if (lsalpha.size()<lssymbol.size()){
                ans = ans.substring(0,ans.length()-2);
            }
            return ans;
        }else {
            return ans;
        }
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans =  -1;
        LinkedList<Integer> indexofvalid = new LinkedList<Integer>();
        LinkedList<Integer> manhattandistance = new LinkedList<Integer>();
        for (int i = 0;i<points.length;i++){
                if (points[i][0] == x || points[i][1] == y){
                    indexofvalid.add(i);
                }
        }
        System.out.println(indexofvalid);
        if (indexofvalid.isEmpty()){
            return -1;
        }
        for (int i =0;i<indexofvalid.size();i++){
                int d = Math.abs(points[indexofvalid.get(i)][0]-x) + Math.abs(points[indexofvalid.get(i)][1]-y);
                manhattandistance.add(d);
        }
        System.out.println(manhattandistance);
        LinkedList<Integer> mindistaneceindex = new LinkedList<Integer>();
        int mind = Integer.MAX_VALUE;
        for (int i = 0;i<manhattandistance.size();i++){
            if (mind > manhattandistance.get(i)){
                mind = manhattandistance.get(i);
            }
        }
        System.out.println(mind);

        for (int i = 0;i<manhattandistance.size();i++){
            if (manhattandistance.get(i) == mind){
                mindistaneceindex.add(i);
            }
        }
        System.out.println(mindistaneceindex);
        ans = Integer.MAX_VALUE;
        for (int i = 0;i<mindistaneceindex.size();i++){
            if (x == points[indexofvalid.get(mindistaneceindex.get(i))][0] && y == points[indexofvalid.get(mindistaneceindex.get(i))][1]) {
                return 0;
            }

            if (x!= points[indexofvalid.get(mindistaneceindex.get(i))][0]) {
                if (ans > points[indexofvalid.get(mindistaneceindex.get(i))][0]) {
                    ans = points[indexofvalid.get(mindistaneceindex.get(i))][0];
                }
            }else {
                if (ans > points[indexofvalid.get(mindistaneceindex.get(i))][1]) {
                    ans = points[indexofvalid.get(mindistaneceindex.get(i))][1];
                }
            }
        }
        System.out.println(ans);
        return ans;
    }


        public int arrangeCoins(int n) {
    int count = 0;
    int i = 1;
    while (n>=i){
        n -= i;
        i++;
        count++;
    }
    return count;
    }

    public static List<Integer> getMax(List<String> operations) {
        // Write your code here

    }

    public int longestMountain(int[] arr) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        int maxlen = 0;
        for (int i = 0;i<arr.length-2;i++){
            for (int j = i+2;j<arr.length;j++){
                int max = i+j ;
            }
        }
        return maxlen;
    }

    public boolean detectCapitalUse(String word) {
        if (word.length()<=1){
            return true;
        }
        if (Character.isUpperCase(word.charAt(0))){
            if (Character.isUpperCase(word.charAt(1))){
                for (int i = 1;i<word.length();i++){
                    if (!Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
                return true;
            }else {
                for (int i = 1;i<word.length();i++){
                    if (!Character.isLowerCase(word.charAt(i))){
                        return false;
                    }
                }
                return true;
            }
        }else {
            for (int i = 1;i<word.length();i++){
                if (!Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }
            return true;
        }
    }

    public int maxind(int[] arr, int s, int e){
        for (int i = s;i<=e-2;i++){
            if (arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
                return i+1;
            }
        }
        return -1;
    }
    public int divide(int dividend, int divisor) {
    if (dividend == -2147483648 && divisor == -1){
        return 2147483647;
    }
    if (dividend == 0){
        return 0;
    }
        int temp = 0;
    if (dividend<0 && divisor>0){
        temp =1;
        dividend*=(-1);
    }
    if (dividend>0 && divisor<0){
        temp = 1;
        divisor*=(-1);
    }
    if (dividend<0 && divisor<0){
        dividend*=(-1);
        divisor*=(-1);
    }
    int ans = 0;
    if (divisor == 1){
        ans = dividend;
    }else {
        ans = dividend / divisor;
    }
        if (divisor == 1 && dividend == 1){
            ans = dividend;
        }
        if (temp == 1 && ans<0){
            return ans;
        }
    if (temp == 1){
        return ((-1)*ans);
    }else {
        return ans;
    }
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        int lastanswer  = 0;
        LinkedList<Integer> ls = new LinkedList<Integer>();

        return ls;
    }
    public class SinglyLinkedListNode {
         int data;
         SinglyLinkedListNode next;
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        while (sumoflist(h1) != sumoflist(h2) || sumoflist(h3) != sumoflist(h2)){
            int a = sumoflist(h1);
            int b = sumoflist(h2);
            int c = sumoflist(h3);

            int maxndex = maxndex(a,b,c);
            if (maxndex == 0){
                h1.remove(0);
            }else if (maxndex == 1){
                h2.remove(0);
            }else if (maxndex == 2){
                h3.remove(0);
            }
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h3);
        }
        return sumoflist(h1);
    }
    public static int sumoflist(List<Integer> ls){
        int sum = 0;
        for (int i = 0;i<ls.size();i++){
            sum += ls.get(i);
        }
        return sum;
    }
    public static int maxndex(int a, int b, int c){
        if (a>=b && a>=c){
            return 0;
        }
        if (b>=a && b>=c){
            return 1;
        }
        if (c>=a && c>=b){
            return 2;
        }
        return 0;
    }

    public String reverseVowels(String s) {
        String ans = "";
        char add = 'a';
        String vowel = "AEIOUaeiou";
        int temp = s.length();
        for (int i =0;i<s.length();i++){
            if (vowel.contains(Character.toString(s.charAt(i)))){
                int repo = 0;
                for (int j =temp-1;j>=0 && repo ==0;j--){
                    if (vowel.contains(Character.toString(s.charAt(j)))){
                        add = s.charAt(j);
                        repo = 1;
                        temp = j;
                    }
                }
                ans += add;
            }else {
                ans += s.charAt(i);
            }
        }
        System.out.println(s);
        System.out.println(ans);
        return ans;
    }

    public boolean isPalindrome(String s) {
    String pal = "";
    String formattedstring = "";
    s.toLowerCase();
    for (int i = 0;i<s.length();i++){
        if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
            formattedstring+=s.charAt(i);
        }
    }
    formattedstring = formattedstring.toLowerCase();
    for (int i = formattedstring.length()-1;i>=0;i--){
        pal+=formattedstring.charAt(i);
    }
        System.out.println(formattedstring);
        System.out.println(pal);
    if (pal.equals(formattedstring)){
        return true;
    }else {
        return false;
    }
    }

    static int arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n];

        for (int i=0;i<queries.length;i++){
            for (int j=(queries[i][0]-1);j<=(queries[i][1]-1);j++){
                arr[j]+=(queries[i][2]);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] arr = new int[queries.length];
            for (int i = 0;i<queries.length;i++){
                for (int j = 0;j<strings.length;j++){
                    if (queries[i].equals(strings[j])){
                        arr[i]++;
                    }
                }
            }
        return arr;
    }
    public String reverseOnlyLetters(String S) {
    int lastindex = S.length()-1;
    String ans = "";
    for (int i = 0;i<S.length() && lastindex>=0;i++){
        int ascii = (int) S.charAt(i);
        if ((ascii>=65 && ascii<90) || (ascii>=97 && ascii<=122)){
            int lastindexascii = (int) S.charAt(lastindex);
            int trm = 0;
            if ((lastindexascii>=65 && lastindexascii<90) || (lastindexascii>=97 && lastindexascii<=122)) {
                ans += S.charAt(lastindex);
                trm = 1;
            }
            lastindex--;
            if (trm!=1){

            }

        }else {
            ans+=S.charAt(i);
        }
    }
    return ans;
    }

    public int singleNumber(int[] nums) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = 0;i<nums.length;i++){
            int temp = ls.get(nums[i]);
            temp++;
            ls.add(nums[i],temp);
        }
        for (int i = 0;i<ls.size();i++){
            if (ls.get(i)==1){
                return i;
            }
        }
        return -1;
    }

    public int minOperations(String[] logs) {
    LinkedList ls = new LinkedList();
    int point = 0;
    ls.add("Main");
    for (int i  = 0;i<logs.length;i++){
        if (logs[i].length()-1>=0) {
            if (logs[i].charAt(logs[i].length() - 1) == '/') {
                if (logs[i].length()-2 >=0) {
                    if (logs[i].charAt(logs[i].length() - 2) != '.') {
                        ls.add(logs[i].substring(0, logs[i].length() - 2));
                        point++;
                    } else {
                        if (logs[i].length() - 3 >= 0) {
                            if (logs[i].charAt(logs[i].length() - 3) == '.' && !ls.isEmpty() && point>=1) {
                                ls.pop();
                                point--;
                            }
                        }
                    }
                }
            }
        }
    }
    return point;
    }

    public String makeGood(String s) {
        LinkedList<Character> lschar = new LinkedList<Character>();
        for (int i = 0;i<s.length();i++){
            lschar.add(s.charAt(i));
        }

        int temp = 0;
        while (temp<=(s.length()+1/2)) {
            for (int i = 0; i < lschar.size()-1; i++) {
                    int upascii = (int) lschar.get(i + 1);
                    int lowscii = (int) lschar.get(i);


                if (lowscii >= 97 && lowscii <= 122 && lowscii - upascii == 32) {
                        lschar.remove(i);
                        lschar.remove(i);
                }

                if (upascii >= 97 && upascii <= 122 && upascii-lowscii == 32) {
                        lschar.remove(i);
                        lschar.remove(i);
                }

            }
            temp++;
        }

        String ans = "";
        for (int i = 0;i<lschar.size();i++){
            ans += lschar.get(i);
        }
        return ans;
    }
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
    int[][] darr = new int[R][C];
    int[][] arr = new int[1][2];
    return darr;
    }

    void prank(long[] a, int n)
    {   
        int bha = 0;
        LinkedList ls = new LinkedList();
        for (int i = 0;i<a.length && bha<a.length;i++){
            int temp = (int) a[i];
            ls.add(a[temp]);
            bha++;
        }
        for (int i = 0;i<a.length;i++){
            System.out.print(ls.get(i)+" ");
        }

    }

    public boolean circularArrayLoop(int[] nums) {
        int temp = 0;
        LinkedList<Integer> ls = new LinkedList<Integer>();
        ls.add(0);
        for (int i = 0;i<nums.length;){
            if (nums[i] >0){
                i += nums[i];
                if (i >nums.length){
                    i=i%nums.length;
                }
                ls.add(i);
            }else {
                i-=nums[i];

            }
            if (ls.getLast() == 0 && temp == 1){
                return true;
            }
            temp =1;
        }
        return false;
    }
}