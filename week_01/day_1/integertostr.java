class HelloWorld {
    public static void main(String[] args)
    {
        int number=460;
        //its convert number into string
        
        String result="" + number;
        
        System.out.println(result);
        
        //checking type of output 
        
        System.out.println(((Object)result).getClass().getSimpleName());
    }
}
