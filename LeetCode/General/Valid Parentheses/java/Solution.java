1class Solution {
2    public boolean isValid(String s1) {
3    Stack <Character> s=new Stack<>();
4
5   for(int i=0;i<s1.length();i++){
6      char ch =s1.charAt(i);
7      if(ch=='(' || ch=='{'|| ch=='['){
8        s.push(ch);
9      }
10      else if(ch ==')' || ch=='}'|| ch==']'){
11
12        if(s.isEmpty()){
13            return false;
14        }
15        char t=s.pop();
16        if((ch==')' && t!='(')||
17          (ch=='}' && t!='{') ||
18         (ch==']' && t!='[')) return false;
19      }
20   }
21
22return s.isEmpty();
23
24        }
25}