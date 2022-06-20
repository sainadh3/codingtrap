public class ineuronpattern {
    public static void main(String args[])
    {

        for(int i=1;i<=7;i++)
        {
            for (int j=1;j<=7;j++)
            {
                if(i==1 || j==4 || i==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for (int j=1;j<=7;j++)
            {
                if(j==1 || (i==2&&j==2) || j==7 || (i==3&&j==3)||(i==4&&j==4)||(i==5&&j==5)||(i==6&&j==6))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for (int j=1;j<=7;j++)
            {
                if(i==1 || j==1 || i==4 || i==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for (int j=1;j<=7;j++)
            {
                if(i==7 || j==1 || j==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for (int j=1;j<=7;j++)
            {
                if( (i==1&&j==5) || j==1 || (i==2&&j==4)|| (i==3&&j==3)|| (i==4&&j==2) || (i==5&&j==3)|| (i==6&&j==4)|| (i==7&&j==5))
                    System.out.print("* ");
                else if (i==1) {
                    if (j==2||j==3||j==4)
                        System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for (int j=1;j<=7;j++)
            {
                if(i==1 || j==1 || i==7 || j==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=7;i++)
        {
            for (int j=1;j<=7;j++)
            {
                if(j==1 || (i==2&&j==2) || j==7 || (i==3&&j==3)||(i==4&&j==4)||(i==5&&j==5)||(i==6&&j==6))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();


    }
}
