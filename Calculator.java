import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Welcome to Calculator");
		char k;
		double n1=0,n2=0;
		long n3=0;
		do
		{
			System.out.println("\nPress 1 for Addition");
			System.out.println("press 2 for Substraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Modulus");
			System.out.println("Press 6 for factorial");
			System.out.println("Press 7 for HCF");
			System.out.println("Press 8 for LCM\n");
			System.out.println("\nEnter your choise");
			int Cho=scn.nextInt();
			if (Cho==6)
			{
				System.out.println("\nEnter the Number");
				n3=scn.nextLong();
			}
			else 
			{
				System.out.println("\nEnter the 1st Value");
				n1=scn.nextDouble();
				System.out.println("Enter the 2st Value");
				n2=scn.nextDouble();
			}
			switch (Cho)
			{
			case 1:{
						System.out.println("The Sum of "+n1+" and "+n2+" is "+ (n1+n2));
						break;
					}
			case 2:{
						System.out.println("The Diffrence between "+n1+" and "+n2+" is "+ (n1-n2));
						break;
					}
			case 3:{
						System.out.println("The Product of "+n1+" and "+n2+" is "+ (n1*n2));
						break;
					}
			case 4:{
						System.out.println("The Division of "+n1+" and "+n2+" is "+ (n1/n2));
						break;
					}
			case 5:{
						System.out.println("The Modulus "+n1+" and "+n2+" is "+ (n1%n2));
						break;
					}
			case 6:{
						long fact=1,temp=n3;
						for (long b=n3;b>=1 ;b-- )
						{
							fact=fact*b;
						}
						System.out.println("The factorial of "+temp+" is "+fact);
						break;
					}
			case 7:{
						double HCF=0;;
						for (double i=1;i<=n1||i<=n2 ;i++ )
						{
							if (n1%i==0&&n2%i==0)
							{
								HCF=i;
							}
						}
						System.out.println("The HCF of "+n1+" and "+n2+" is "+ HCF);
						break;
					}
			case 8:{
						double HCF=0,LCM=0;
						for (double i=1;i<=n1||i<=n2 ;i++ )
						{
							if (n1%i==0&&n2%i==0)
							{
								HCF=i;
							}
						}
						LCM=(n1*n2)/HCF;
						System.out.println("The HCF of "+n1+" and "+n2+" is "+ LCM);
						break;
					}
			default :	System.out.println("Enter the valid input");
			}
			System.out.println("\nEnter Y to use calculator again\nEnter any other key to close clculator ");
			k=scn.next().charAt(0);
		}	while (k=='Y'||k=='y');
	}
}
