class Snake {
    
    static String direction = ""; // UP, RIGHT, DOWN, LEFT
    private int tableRows = 15;
    private int tableColumns = 50;
    
    private String tableData [][] = new String[tableRows][tableColumns];
    private int fruit [] = new int[2];
    
    
    private Double tableUpdateTime = (double)(1000/30);
    
    
    public static void main(String[] args) {
        Snake snake = new Snake();
        
    }
    
    //controls native method to call c++ function
    
    static native void controls();
    
    public static void controlUp(){
        
    }
    
    public static void controlRight(){
        
    }
    
    public static void controlDown(){
        
    }

    public static void controlLeft(){
        
    }
    
    public static void controlExil(){
        
    }
}
