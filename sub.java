// Programs to give input through command line and display its subtraction.
class sub
{
static
{
    System.out.println("subtract two numbers");
}
    public static void main(String args[])
    {
        int a= Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a-b;
        System.out.println(c);
    }
}


