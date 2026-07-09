// Last updated: 7/9/2026, 3:11:11 PM
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||s.length()<=numRows){
            return s;
        }
        StringBuilder[]rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int cr=0;
        boolean g=false;
        for(char c:s.toCharArray()){
            rows[cr].append(c);
            if(cr==0||cr==numRows-1){
                g=!g;
            }
            if(g){
                cr++;
            }else{
                cr--;
            }
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row:rows){
            result.append(row);
        }
        return result.toString();
    }
}