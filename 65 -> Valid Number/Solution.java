class Solution {
    public boolean isNumber(String s) {
        
        try{
            if(s.contains("f") || s.contains("d")|| s.contains("F") || s.contains("D")){
                return false;
            }
           
    
            
            Double d=Double.parseDouble(s);
            
            return true;
            
        }catch(Exception e)
        {
            return false;
        }
    }
}