public static String timeConversion(String s) {
    // Write your code here
    String time="";
   if(s.substring(8,10).equals("PM") ){
       if(s.substring(0,2).equals("12")){
       time=s.substring(0,8); 
       }
       else{
           int a=Integer.parseInt(s.substring(0,2));
           int b=a+12;
           String ss=String.valueOf(b);
           time=ss+s.substring(2,8);
       }  
    }
    else{
        if(s.substring(0,2).equals("12")){
            time="00"+s.substring(2,8);
        }
        else{
            time=s.substring(0,8);
        }
    }
   
return time;
    }

}