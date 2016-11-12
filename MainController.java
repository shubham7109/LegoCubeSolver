package solver;

import java.util.Random;
import java.util.Scanner;

public class MainController {
	
	public static void showStatus()
	{
		System.out.println("White Side : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(stateOfCube.W[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Red side : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(stateOfCube.R[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Orange Side : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(stateOfCube.O[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Blue Side : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(stateOfCube.B[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Green Side : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(stateOfCube.G[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Yellow Side : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(stateOfCube.Y[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void randomize()
	{
		int a;
		for(int i=0;i<25;i++)
		{
			Random r = new Random(); 
			a = r.nextInt(12)+1;
			if ( a == 1 )
	             moveUpper.moveU();
	        else if ( a == 2 )
	             moveUpperInv.moveUi();
	        else if ( a == 3 )
	             moveDown.moveD();
	        else if ( a == 4 )
	             moveDownInv.moveDi();
	        else if ( a == 5 )
	             moveFront.moveF();
	        else if ( a == 6 )
	             moveFrontInv.moveFi();
	        else if ( a == 7 )
	             moveLeft.moveL();
	        else if ( a == 8 )
	             moveLeftInv.moveLi();
	        else if ( a == 9 )
	             moveRight.moveR();
	        else if ( a == 10 )
	             moveRightInv.moveRi();
	        else if ( a == 11 )
	             moveBack.moveB();
	        else if ( a == 12 )
	             moveBackInv.moveBi();
		}
		System.out.println("The cube has been randomized");
		showStatus();
	}
	
	public static void reset()
	{
		stateOfCube.W[0][0] =11;
        stateOfCube.W[0][1] =12;
        stateOfCube.W[0][2] =13;
        stateOfCube.W[1][0] =14;
        stateOfCube.W[1][1] =15;
        stateOfCube.W[1][2] =16;
        stateOfCube.W[2][0] =17;
        stateOfCube.W[2][1] =18;
        stateOfCube.W[2][2] =19;

        stateOfCube.R[0][0] =21;
        stateOfCube.R[0][1] =22;
        stateOfCube.R[0][2] =23;
        stateOfCube.R[1][0] =24;
        stateOfCube.R[1][1] =25;
        stateOfCube.R[1][2] =26;
        stateOfCube.R[2][0] =27;
        stateOfCube.R[2][1] =28;
        stateOfCube.R[2][2] =29;

        stateOfCube.O[0][0] =31;
        stateOfCube.O[0][1] =32;
        stateOfCube.O[0][2] =33;
        stateOfCube.O[1][0] =34;
        stateOfCube.O[1][1] =35;
        stateOfCube.O[1][2] =36;
        stateOfCube.O[2][0] =37;
        stateOfCube.O[2][1] =38;
        stateOfCube.O[2][2] =39;

        stateOfCube.B[0][0] =41;
        stateOfCube.B[0][1] =42;
        stateOfCube.B[0][2] =43;
        stateOfCube.B[1][0] =44;
        stateOfCube.B[1][1] =45;
        stateOfCube.B[1][2] =46;
        stateOfCube.B[2][0] =47;
        stateOfCube.B[2][1] =48;
        stateOfCube.B[2][2] =49;

        stateOfCube.G[0][0] =51;
        stateOfCube.G[0][1] =52;
        stateOfCube.G[0][2] =53;
        stateOfCube.G[1][0] =54;
        stateOfCube.G[1][1] =55;
        stateOfCube.G[1][2] =56;
        stateOfCube.G[2][0] =57;
        stateOfCube.G[2][1] =58;
        stateOfCube.G[2][2] =59;

        stateOfCube.Y[0][0] =61;
        stateOfCube.Y[0][1] =62;
        stateOfCube.Y[0][2] =63;
        stateOfCube.Y[1][0] =64;
        stateOfCube.Y[1][1] =65;
        stateOfCube.Y[1][2] =66;
        stateOfCube.Y[2][0] =67;
        stateOfCube.Y[2][1] =68;
        stateOfCube.Y[2][2] =69;
	}

	public static void main(String[] args) {

	int check=1;
	int choice=0;
		do
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println("1.MoveU");
			System.out.println("2.MoveUi");
			System.out.println("3.MoveF");
			System.out.println("4.MoveFi");
			System.out.println("5.MoveB");
			System.out.println("6.MoveBi");
			System.out.println("7.MoveL");
			System.out.println("8.MoveLi");
			System.out.println("9.MoveR");
			System.out.println("10.MoveRi");
			System.out.println("11.MoveD");
			System.out.println("12.MoveDi");
			System.out.println("13.Randomize the cube");
			System.out.println("14.Solve the cube");
			System.out.println("15.Reset the cube");
			choice=in.nextInt();
			if(choice<1 || choice>15)
				System.out.println("Invalid input, please try again");
			
			if(choice==1)
			{
				
				moveUpper.moveU();
				showStatus();
			}
			
			else if(choice==2)
			{
				moveUpperInv.moveUi();
				showStatus();
			}
			
			else if(choice==3)
			{
				moveFront.moveF();
				showStatus();
			}
			
			else if(choice==4)
			{
				moveFrontInv.moveFi();
				showStatus();
			}
			
			else if(choice==5)
			{
				moveBack.moveB();
				showStatus();
			}
			
			else if(choice==6)
			{
				moveBackInv.moveBi();
				showStatus();
			}
			
			else if(choice==7)
			{
				moveLeft.moveL();
				showStatus();
			}
			
			else if(choice==8)
			{
				moveLeftInv.moveLi();
				showStatus();
			}
			
			else if(choice==9)
			{
				moveRight.moveR();
				showStatus();
			}
			
			else if(choice==10)
			{
				moveRightInv.moveRi();
				showStatus();
			}
			
			else if(choice==11)
			{
				moveDown.moveD();
				showStatus();
			}
			
			else if(choice==12)
			{
				moveDownInv.moveDi();
				showStatus();
			}
			
			else if(choice==13)
			{
				randomize();
			}
			
			else if(choice==14)
			{
				algorithmStage1.stage1();
				
				algorithmStage2.stage2();
				
				algorithmStage3.stage3();
				
				algorithmStage4.stage4();
				
				algorithmStage5.stage5();
				
				algorithmStage6.stage6();
				
				algorithmStage7.stage7();
				System.out.println("The cube has been solved!!");
				showStatus();
			}
			
			else if(choice==15)
			{
				reset();
				showStatus();
			}
		
		}while(check==1);

	}
}