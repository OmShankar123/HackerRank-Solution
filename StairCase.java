public static void staircase(int n) {
    // Write your code here
    for(int i=1;i<=n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("#");
        }
        System.out.println();
    }

    }

}