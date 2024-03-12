class ADD
{
    public int add(int nums[])
    {
        int result=0;
        for(int n:nums)
        {
            result= result+n;
        }
        return result;

    }
}




public class Demo2D 
{
    public static void main(String[] args) 
    {    
        ADD obj= new ADD();
        
        int result=obj.add(new int[]{5,4,3,7});
    
        
        System.out.println(result);         

        

        

        
    }
    
}
