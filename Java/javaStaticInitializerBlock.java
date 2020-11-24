private static int B,H;
private static boolean flag=true;
private static Scanner ob = new Scanner(System.in);
static {
        B = ob.nextInt();
        H = ob.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
         
    
}

