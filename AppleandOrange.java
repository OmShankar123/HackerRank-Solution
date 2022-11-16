public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
   
    int m=apples.size();
    int n=oranges.size();
    int app=0;
    int oran=0;
    //apple
    for(int j=0;j<m;j++){
        apples.set(j,(apples.get(j)+a));
        if(apples.get(j)>=s && apples.get(j)<=t){
            app++;
        }
    }
    
    //orange
    for(int i=0;i<n;i++){
        oranges.set(i,(oranges.get(i)+b));
        if(oranges.get(i)>=s && oranges.get(i)<=t){
            oran++;
        }
    }
    System.out.println(app);
     
    System.out.println(oran);
    }

}
}
