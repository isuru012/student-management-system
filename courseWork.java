import java.util.*;
class courseWork{
	static Scanner scan=new Scanner(System.in);
	static String st[][]=new String[0][2];
	static int marks[][] =new int[0][2];
	static double avg1[] =new double[0];
	static double avgRank[] =new double[0];
	static int opt;
	public static void main(String args[]){
		menu();
	}
	public static void menu(){
		System.out.println("-------------------------------------------------------------------------------------------------------------------");	
		System.out.println(	"╦ ╦╔═╗╦  ╔═╗╔═╗╔╦╗╔═╗  ╔╦╗╔═╗  ╔═╗╔╦╗╔═╗╔═╗  ╔╦╗╔═╗╦═╗╦╔═╔═╗  ╔╦╗╔═╗╔╗╔╔═╗╔═╗╔═╗╔╦╗╔═╗╔╗╔╔╦╗  ╔═╗╦ ╦╔═╗╔╦╗╔═╗╔╦╗");
        System.out.println(	"║║║║╣ ║  ║  ║ ║║║║║╣    ║ ║ ║  ║ ╦ ║║╚═╗║╣   ║║║╠═╣╠╦╝╠╩╗╚═╗  ║║║╠═╣║║║╠═╣║ ╦║╣ ║║║║╣ ║║║ ║   ╚═╗╚╦╝╚═╗ ║ ║╣ ║║║");
        System.out.println(	"╚╩╝╚═╝╩═╝╚═╝╚═╝╩ ╩╚═╝   ╩ ╚═╝  ╚═╝═╩╝╚═╝╚═╝  ╩ ╩╩ ╩╩╚═╩ ╩╚═╝  ╩ ╩╩ ╩╝╚╝╩ ╩╚═╝╚═╝╩ ╩╚═╝╝╚╝ ╩   ╚═╝ ╩ ╚═╝ ╩ ╚═╝╩ ╩");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		System.out.println();
		System.out.println("[1] Add New Student                      "+"                          [2] Add New Student With Marks ");
		System.out.println("[3] Add Marks                      "+"                                [4] Update Student Details ");
		System.out.println("[5] Update Marks                      "+"                             [6] Delete Student ");
		System.out.println("[7] Print Student Details                   "+"                       [8] Print Student Ranks ");
		System.out.println("[9] Best in Programming Fundamentals            "+"                   [10] Best in Database Management System ");
		System.out.println();
		
		System.out.print("Enter an Option to continue >");
		opt=scan.nextInt();
		
			switch (opt){
			case 1:
				clearConsole();
				addStudent();
				break;
			case 2:
				clearConsole();
				addStudentWithMarks();
				break;
			case 3:
				clearConsole();
				addMarks();
				break;
			case 4:
				clearConsole();
				updateStudent();
				break;
			case 5:
				clearConsole();
				updateMarks();
				break;
			case 6:
				clearConsole();
				deleteStudent();
				break;
			case 7:
				clearConsole();
				printStudentDetails();
				break;
			case 8:
				clearConsole();
				studentRanks();
				break;
			case 9:
				clearConsole();
				bestPrf();
				break;
			case 10:
				clearConsole();
				bestDbms();
				break;
			default:
			clearConsole();
			menu();	
			}
		}
	public static void addStudent(){
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("				╔═╗╔╦╗╔╦╗  ╔╗╔╔═╗╦ ╦  ╔═╗╔╦╗╦ ╦╔╦╗╔═╗╔╗╔╔╦╗");
		System.out.println("				╠═╣ ║║ ║║  ║║║║╣ ║║║  ╚═╗ ║ ║ ║ ║║║╣ ║║║ ║"); 
		System.out.println("				╩ ╩═╩╝═╩╝  ╝╚╝╚═╝╚╩╝  ╚═╝ ╩ ╚═╝═╩╝╚═╝╝╚╝ ╩");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		boolean decision=false;
		
		do{
		marks=extendArray2();
		st=extendArray();
			do{
				System.out.print("Enter Student ID    :");
				st[st.length-1][0]=scan.next();
				int count=0;
				for(int i=0;i<st.length-1;i++){
				if(st[st.length-1][0].equals(st[i][0])){
				count++;
					}
				}
				if(count==1){
					System.out.println("The Student ID already exists");
					}else{
						break;
						}
			}while(true);
			System.out.print("Enter Student Name  :");
			st[st.length-1][1]=scan.next();
			System.out.print("Student has been added successfully.");
		
			char search='y';
			String yes="to add a new student (y/n)";
			search=yesOrNo(yes,search);
			if(search=='n'){
				clearConsole();
				menu();
				break;
				} 
		}while(true);
	}
	public static void addStudentWithMarks(){
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println( "			╔═╗╔╦╗╔╦╗  ╔╗╔╔═╗╦ ╦  ╔═╗╔╦╗╦ ╦╔╦╗╔═╗╔╗╔╔╦╗  ╦ ╦╦╔╦╗╦ ╦  ╔╦╗╔═╗╦═╗╦╔═╔═╗");
        System.out.println( "			╠═╣ ║║ ║║  ║║║║╣ ║║║  ╚═╗ ║ ║ ║ ║║║╣ ║║║ ║   ║║║║ ║ ╠═╣  ║║║╠═╣╠╦╝╠╩╗╚═╗");
        System.out.println( "			╩ ╩═╩╝═╩╝  ╝╚╝╚═╝╚╩╝  ╚═╝ ╩ ╚═╝═╩╝╚═╝╝╚╝ ╩   ╚╩╝╩ ╩ ╩ ╩  ╩ ╩╩ ╩╩╚═╩ ╩╚═╝");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		boolean decision=false;
		do{
			st=extendArray();
			do{
				System.out.print("Enter Student ID    :");
				st[st.length-1][0]=scan.next();
				int count=0;
				for(int i=0;i<st.length-1;i++){
				if(st[st.length-1][0].equals(st[i][0])){
					count++;
					}
				}
				if(count==1){
					System.out.println("The Student ID already exists");
				}else{
					break;
				}
			}while(true);
			System.out.print("Enter Student Name  :");
			st[st.length-1][1]=scan.next();
			marks=extendArray2();
				do{
					System.out.print("Programming Fundamental Marks :");
					int prf=scan.nextInt();
					if(prf>=0 && prf<=100){
						marks[marks.length-1][0]=prf;
						break;
						}else{
							System.out.println("Invalid marks,please enter correct marks.");
							}
				}while(true);
					do{
						System.out.print("Database Management System Marks :");
						int dbms=scan.nextInt();
						if(dbms>=0 && dbms<=100){
							marks[marks.length-1][1]=dbms;
							break;
							}else{
								System.out.println("Invalid marks,please enter correct marks.");
								}
					}while(true);
					System.out.print("Student has been added successfully.");
					char search='y';
					String yes="to add a new student (y/n)";
					search=yesOrNo(yes,search);
					if(search=='n'){
						clearConsole();
						menu();
						break;
					}  
	
		}while(true);	
			
	}
	public static void addMarks(){
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("                    				╔═╗╔╦╗╔╦╗  ╔╦╗╔═╗╦═╗╦╔═╔═╗");
        System.out.println("                    				╠═╣ ║║ ║║  ║║║╠═╣╠╦╝╠╩╗╚═╗");
        System.out.println("                    				╩ ╩═╩╝═╩╝  ╩ ╩╩ ╩╩╚═╩ ╩╚═╝");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
		int coun=0;
		boolean desci2=true;
		do{
			boolean desci=true;
			int index=-1;	
			do{
				String stid=null;
				boolean desci3=false;
				stid=studentIdCheck(stid);
				for(int i=0;i<st.length;i++){
				if(stid .equals (st[i][0])){
					index=i;
					}
				}
				if( marks[index][0]==0 && marks[index][1]==0){
					System.out.println("Student Name :"+st[index][1]);
					desci=false;
				}else{
					System.out.println("Student Name :"+st[index][1]);
					System.out.println("This Student's marks have been already added. \nIf you want to update the marks,please use [4] Update Marks option.");
					System.out.println();
					char search='y';
					String yes="to add marks for another student?(y/n)";
					search=yesOrNo(yes,search);
					if(search=='n'){
						clearConsole();
						menu();
						break;
						}
					}
		   
		   }while(desci);
				do{
					System.out.print("Programming Fundamental Marks :");
					int prf=scan.nextInt();
					if(prf>=0 && prf<=100){
						marks[index][0]=prf;
					break;
					}else{
						System.out.println("Invalid marks,please enter correct marks.");
						System.out.println();		
						}
				}while(true);
					do{
						System.out.print("Database Management System Marks :");
						int dbms=scan.nextInt();
						if(dbms>=0 && dbms<=100){
							marks[index][1]=dbms;
						break;
						}else{
							System.out.println("Invalid marks,please enter correct marks.");
							System.out.println();		
							}
					}while(true);
						System.out.print("Marks have been added.");
						char search='y';
						String yes="to add marks for another student?(y/n)";
						search=yesOrNo(yes,search);
						if(search=='n'){
							clearConsole();
							menu();
							break;
							}
		
		}while(true);	
}

	public static void updateStudent(){
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("			╦ ╦╔═╗╔╦╗╔═╗╔╦╗╔═╗  ╔═╗╔╦╗╦ ╦╔╦╗╔═╗╔╗╔╔╦╗  ╔╦╗╔═╗╔╦╗╔═╗╦╦  ╔═╗");
		System.out.println("			║ ║╠═╝ ║║╠═╣ ║ ║╣   ╚═╗ ║ ║ ║ ║║║╣ ║║║ ║    ║║║╣  ║ ╠═╣║║  ╚═╗");
		System.out.println("			╚═╝╩  ═╩╝╩ ╩ ╩ ╚═╝  ╚═╝ ╩ ╚═╝═╩╝╚═╝╝╚╝ ╩   ═╩╝╚═╝ ╩ ╩ ╩╩╩═╝╚═╝");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

		String stid=null;
		boolean desci3=false;
		do{
			stid=studentIdCheck(stid);
			int index=0;
			for(int i=0;i<st.length;i++){
				if(stid .equals (st[i][0])){
					index=i;
					}
			}
			System.out.println("Student Name :"+st[index][1]);
			System.out.println();
			System.out.print("Enter the new student name :");
			st[index][1]=scan.next();
			System.out.println("\nStudent details has been updated successfully.");
			char search='y';
			String yes="to update another student details?(y/n)";
			search=yesOrNo(yes,search);
			if(search=='n'){
				clearConsole();
				menu();
				break;
				}
	  }while(true);
	}
		
	public static void updateMarks(){
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("					╦ ╦╔═╗╔╦╗╔═╗╔╦╗╔═╗  ╔╦╗╔═╗╦═╗╦╔═╔═╗");
		System.out.println("					║ ║╠═╝ ║║╠═╣ ║ ║╣   ║║║╠═╣╠╦╝╠╩╗╚═╗");
		System.out.println("					╚═╝╩  ═╩╝╩ ╩ ╩ ╚═╝  ╩ ╩╩ ╩╩╚═╩ ╩╚═╝");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		
		String stid=null;
		boolean desci3=false;
		do{
			stid=studentIdCheck(stid);
			int index=0;
			for(int i=0;i<st.length;i++){
				if(stid .equals (st[i][0])){
					index=i;
					}
				}              
			System.out.println("Student Name :"+st[index][1]);
			System.out.println();         
	    
			if( marks[index][0]==0 && marks[index][1]==0){
				System.out.println("This student's marks yet to be added.");
				}else if(marks[index][0]!=0 || marks[index][1]!=0){
					System.out.println("Programming Fundamental Marks :"+marks[index][0]);
					System.out.println("Database Management System Marks :"+marks[index][1]);
					System.out.println();
					do{
					System.out.print("Enter new Programming Fundamental Marks    :");
					int prf=scan.nextInt();
					if(prf>=0 && prf<=100){
						marks[index][0]=prf;
					break;
					}else{
						System.out.println("Invalid marks,please enter correct marks.");
						System.out.println();		
						}
				}while(true);
					do{
						System.out.print("Enter new Database Management System Marks :");
						int dbms=scan.nextInt();
						if(dbms>=0 && dbms<=100){
							marks[index][1]=dbms;
						break;
						}else{
							System.out.println("Invalid marks,please enter correct marks.");
							System.out.println();		
							}
					}while(true);
					System.out.println("Marks have been updated successfully.");
					}
				char search='y';
				String yes="to update the marks of another student?(y/n)";
				search=yesOrNo(yes,search);
				if(search=='n'){
					clearConsole();
					menu();
					break;
					}
		}while(true);
	}
		
	public static void deleteStudent(){
			System.out.println("-------------------------------------------------------------------------------------------------------------------");
			System.out.println("				 ╔╦╗╔═╗╦  ╔═╗╔╦╗╔═╗  ╔═╗╔╦╗╦ ╦╔╦╗╔═╗╔╗╔╔╦╗");
			System.out.println("			          ║║║╣ ║  ║╣  ║ ║╣   ╚═╗ ║ ║ ║ ║║║╣ ║║║ ║ ");
			System.out.println("				 ═╩╝╚═╝╩═╝╚═╝ ╩ ╚═╝  ╚═╝ ╩ ╚═╝═╩╝╚═╝╝╚╝ ╩ ");
			System.out.println("-------------------------------------------------------------------------------------------------------------------");
			
			String stid=null;
			boolean desci3=false;
			do{
				stid=studentIdCheck(stid);
				int index=0;
				for(int i=0;i<st.length;i++){
					if(stid .equals (st[i][0])){
						index=i;
						}
					}
				st[index][0]=null;
				st[index][1]=null;
				marks[index][0]=0;
				marks[index][1]=0;
				System.out.println("Student has been deleted successfully");
				char search='y';
				String yes="to delete another student?(y/n)";
				search=yesOrNo(yes,search);
				if(search=='n'){
					clearConsole();
					menu();
					break;
					}
	       
			}while(true);          
	}
	
	public static void printStudentDetails(){
		rankMethod();
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("					╔═╗╦═╗╦╔╗╔╔╦╗  ╔═╗╔╦╗╦ ╦╔╦╗╔═╗╔╗╔╔╦╗  ╔╦╗╔═╗╔╦╗╔═╗╦╦  ╔═╗");
		System.out.println("					╠═╝╠╦╝║║║║ ║   ╚═╗ ║ ║ ║ ║║║╣ ║║║ ║    ║║║╣  ║ ╠═╣║║  ╚═╗");
		System.out.println("					╩  ╩╚═╩╝╚╝ ╩   ╚═╝ ╩ ╚═╝═╩╝╚═╝╝╚╝ ╩   ═╩╝╚═╝ ╩ ╩ ╩╩╩═╝╚═╝");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		rankMethod();
		boolean desci3=false;
		
		String stid="isu";
		do{
			int index=0;
			stid=studentIdCheck(stid);
			for(int i=0;i<st.length;i++){
				if(stid .equals (st[i][0])){
					index=i;
					}
				}              
			System.out.println("Student Name :"+st[index][1]);
			if( marks[index][0]==0 && marks[index][1]==0){
				System.out.println("Marks yet to be added");
				}else if(marks[index][0]!=0 || marks[index][1]!=0){
					System.out.printf("+--------------------------------------+-----------------------+%n");
					System.out.printf("|%-37s | %22d|%n","Programming Fundamentals Marks",marks[index][0]);
					System.out.printf("|%-37s | %22d|%n","Database Management System Marks",marks[index][1]);
					System.out.printf("|%-37s | %22d|%n","Total Marks",(marks[index][0]+marks[index][1]));
					double avg=((marks[index][0]+marks[index][1])/2.0);
					System.out.printf("|%-37s |                  %.2f|%n","Avg. Marks",avg);
					int[][] rank = new int[marks.length][3];
					rank=rankStudent(rank);
					String rankW="";
					for (int i = 0; i <marks.length; i++){
						if(index==rank[i][0]){
							switch (rank[i][1])
							{
							case 1:
								rankW="(First)";
								break;
							case 2:
								rankW="(Second)";
								break;
							case 3:
								rankW="(Third)";
								break;
							case 4:
								rankW="(Fourth)";
								break;
							case 5:
								rankW="(Fifth)";
								break;
							case 6:
								rankW="(Sixth)";
								break;
							case 7:
								rankW="(Seventh)";
								break;
							case 8:
								rankW="(Eigthth)";
								break;
							case 9:
								rankW="(Nineth)";
								break;
							case 10:
								rankW="(Tenth)";
								break;
							default:
								rankW="";
							}
							if (marks[index][0]!=0 || marks[index][1]!=0){
								System.out.printf("|%-37s | %13d%9s|%n","Rank",rank[i][1],rankW);
									}
							}
						}
						System.out.printf("+--------------------------------------+-----------------------+%n");
					}
					char search='y';
					String yes="to search another student details?(y/n)";
					search=yesOrNo(yes,search);
					if(search=='n'){
						clearConsole();
						menu();
						break;
							}
		}while(true);
	}
	public static void studentRanks(){
			System.out.println("-------------------------------------------------------------------------------------------------------------------");
			System.out.println("				╔═╗╦═╗╦╔╗╔╔╦╗  ╔═╗╔╦╗╦ ╦╔╦╗╔═╗╔╗╔╔╦╗  ╦═╗╔═╗╔╗╔╦╔═╔═╗");
			System.out.println("				╠═╝╠╦╝║║║║ ║   ╚═╗ ║ ║ ║ ║║║╣ ║║║ ║   ╠╦╝╠═╣║║║╠╩╗╚═╗");
			System.out.println("				╩  ╩╚═╩╝╚╝ ╩   ╚═╝ ╩ ╚═╝═╩╝╚═╝╝╚╝ ╩   ╩╚═╩ ╩╝╚╝╩ ╩╚═╝");
			System.out.println("-------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			rankMethod();
			int[][] rank = new int[marks.length][3];
			rank=rankStudent(rank);
			do{
				System.out.printf("+%-7s+%-6s+%-17s+%13s+%13s+%n","-------","------","-----------------","------------","------------");
				System.out.printf("|%-7s|%-6s|%-17s|%-13s|%-13s|%n","Rank","Id","Name","Total Marks","Avg. Marks");
				System.out.printf("+%-7s+%-6s+%-17s+%13s+%13s+%n","-------","------","-----------------","------------","------------");
				for (int i = 0; i < avg1.length; i++){
					if(avgRank[i]>0){
						double avg2=avgRank[i];
						System.out.printf("|%-7d|%-6s|%-17s|%13d|        %.2f|%n",rank[i][1],st[rank[i][0]][0],st[rank[i][0]][1],rank[i][2],avg2);
						}
					}
					System.out.printf("+%-7s+%-6s+%-17s+%13s+%13s+%n","-------","------","-----------------","------------","------------");
					char search='y';
					String yes="to go back to main menu?(y/n)";
					search=yesOrNo(yes,search);
					if(search=='y'){
						clearConsole();
						menu();
						break;										
						}
			}while(true);
	}
	public static void bestPrf(){
				System.out.println("-------------------------------------------------------------------------------------------------------------------");		
				System.out.println("		╔╗ ╔═╗╔═╗╔╦╗  ╦╔╗╔  ╔═╗╦═╗╔═╗╔═╗╦═╗╔═╗╔╦╗╔╦╗╦╔╗╔╔═╗  ╔═╗╦ ╦╔╗╔╔╦╗╔═╗╔╦╗╔═╗╔╗╔╔╦╗╔═╗╦  ╔═╗");
				System.out.println("		╠╩╗║╣ ╚═╗ ║   ║║║║  ╠═╝╠╦╝║ ║║ ╦╠╦╝╠═╣║║║║║║║║║║║ ╦  ╠╣ ║ ║║║║ ║║╠═╣║║║║╣ ║║║ ║ ╠═╣║  ╚═╗");
				System.out.println("		╚═╝╚═╝╚═╝ ╩   ╩╝╚╝  ╩  ╩╚═╚═╝╚═╝╩╚═╩ ╩╩ ╩╩ ╩╩╝╚╝╚═╝  ╚  ╚═╝╝╚╝═╩╝╩ ╩╩ ╩╚═╝╝╚╝ ╩ ╩ ╩╩═╝╚═╝");
				System.out.println("-------------------------------------------------------------------------------------------------------------------");
				System.out.println();
				rankMethod();
				do{
					System.out.printf("+%-6s+%-17s+%-12s+%-12s+%n","------","-----------------","------------","------------");
					System.out.printf("|%-6s|%-17s|%-12s|%-12s|%n","Id","Name","PF Marks","DBMS Marks");
					System.out.printf("+%-6s+%-17s+%-12s+%-12s+%n","------","-----------------","------------","------------");
					int [][] prf=new int[marks.length][2];
					for(int i = 0; i < marks.length; i++){
						prf[i][0] = i;
						prf[i][1] =marks[i][0];
						}
						for(int j = 0; j < prf.length; j++){
							for(int i = 0; i < prf.length - 1; i++){
								if(prf[i+1][1] > prf[i][1]){
									int temp = prf[i][1];
									prf[i][1] = prf[i+1][1];
									prf[i+1][1] = temp;
					
									int tempIndex = prf[i][0];
									prf[i][0] = prf[i+1][0];
									prf[i+1][0] = tempIndex;
					
										}
									}
								}
								for (int i = 0; i <marks.length; i++){
									if(marks[prf[i][0]][0]!=0 || marks[prf[i][0]][1]!=0){
										System.out.printf("|%-6s|%-17s|%-12d|%-12d|%n",st[prf[i][0]][0],st[prf[i][0]][1],prf[i][1],marks[prf[i][0]][1]);
											}
									}
									System.out.printf("+%-6s+%-17s+%-12s+%-12s+%n","------","-----------------","------------","------------");
									char search='y';
									String yes="to go back to main menu?(y/n)";
									search=yesOrNo(yes,search);
									if(search=='y'){
									clearConsole();
									menu();
									break;										
									}
				}while(true);
		}
	
	public static void bestDbms(){
			System.out.println("-------------------------------------------------------------------------------------------------------------------");	
			System.out.println("	╔╗ ╔═╗╔═╗╔╦╗  ╦╔╗╔  ╔╦╗╔═╗╔╦╗╔═╗╔╗ ╔═╗╔═╗╔═╗  ╔╦╗╔═╗╔╗╔╔═╗╔═╗╔═╗╔╦╗╔═╗╔╗╔╔╦╗  ╔═╗╦ ╦╔═╗╔╦╗╔═╗╔╦╗");
			System.out.println("	╠╩╗║╣ ╚═╗ ║   ║║║║   ║║╠═╣ ║ ╠═╣╠╩╗╠═╣╚═╗║╣   ║║║╠═╣║║║╠═╣║ ╦║╣ ║║║║╣ ║║║ ║   ╚═╗╚╦╝╚═╗ ║ ║╣ ║║║");
			System.out.println("	╚═╝╚═╝╚═╝ ╩   ╩╝╚╝  ═╩╝╩ ╩ ╩ ╩ ╩╚═╝╩ ╩╚═╝╚═╝  ╩ ╩╩ ╩╝╚╝╩ ╩╚═╝╚═╝╩ ╩╚═╝╝╚╝ ╩   ╚═╝ ╩ ╚═╝ ╩ ╚═╝╩ ╩");
			System.out.println("-------------------------------------------------------------------------------------------------------------------");	
			System.out.println();
			rankMethod();
			do{
				System.out.printf("+%-6s+%-17s+%-12s+%-12s+%n","------","-----------------","------------","------------");
				System.out.printf("|%-6s|%-17s|%-12s|%-12s|%n","Id","Name","DBMS Marks","PF Marks");
				System.out.printf("+%-6s+%-17s+%-12s+%-12s+%n","------","-----------------","------------","------------");
		
				int [][] dbms=new int[marks.length][2];
				for(int i = 0; i < marks.length; i++){
					dbms[i][0] = i;
					dbms[i][1] =marks[i][1];
						}
						for(int j = 0; j < dbms.length; j++){
							for(int i = 0; i < dbms.length - 1; i++){
								if(dbms[i+1][1] > dbms[i][1]){
									int temp = dbms[i][1];
									dbms[i][1] = dbms[i+1][1];
									dbms[i+1][1] = temp;
					
									int tempIndex = dbms[i][0];
									dbms[i][0] = dbms[i+1][0];
									dbms[i+1][0] = tempIndex;
										}
								}
						}
						for (int i = 0; i <marks.length; i++){
							if(marks[dbms[i][0]][0]!=0 || marks[dbms[i][0]][1]!=0){
								System.out.printf("|%-6s|%-17s|%-12d|%-12d|%n",st[dbms[i][0]][0],st[dbms[i][0]][1],dbms[i][1],marks[dbms[i][0]][0]);
									}
							}
							System.out.printf("+%-6s+%-17s+%-12s+%-12s+%n","------","-----------------","------------","------------");
							char search='a';
							String yes="to go back to main menu?(y/n)";
							search=yesOrNo(yes,search);
							if(search=='y'){
								clearConsole();
								menu();
								break;										
								}
			}while(true);
	}
	public static int[][] rankStudent(int[][] rank){
		for(int i = 0; i < marks.length; i++){
			rank[i][0] = i;
			rank[i][2] = (marks[i][0] + marks[i][1]);
				}
				for(int j = 0; j < rank.length-1; j++){
					for(int i = 0; i < rank.length - 1; i++){
						if(rank[i+1][2] > rank[i][2]){
							int temp = rank[i][2];
							rank[i][2] = rank[i+1][2];
							rank[i+1][2] = temp;
					
							int tempMark = rank[i][0];
							rank[i][0] = rank[i+1][0];
							rank[i+1][0] = tempMark;
								}
						}
				}
				for(int i = 0; i < rank.length; i++){
				rank[i][1] = i+1 ;
					}	
					for(int j = 0; j < rank.length - 1; j++){
						if(rank[j][2] == rank[j+1][2])rank[j+1][1] = rank[j][1];
						}
						return(rank);
		
	}
	public static void rankMethod(){
			int count=0;
		    for(int i=0;i<marks.length;i++){
				if(avg1.length<marks.length){
					avg1=extendArray3();
					avgRank=extendArray4();
						}
						avg1[count]=((marks[i][0]+marks[i][1])/2.0);
						count++;	
		
					}
					for(int i=0;i<count;i++){
						avgRank[i]=avg1[i];
						}
						rank(avgRank);
	}
	public static void rank(double [] avgRank){
		for (int i = 0; i <avgRank.length-1; i++){
			for (int j = 0; j <avgRank.length-1; j++){
				if (avgRank[j] < avgRank[j + 1]) {
					double temp = avgRank[j];
					avgRank[j] = avgRank[j + 1];
					avgRank[j + 1] = temp;
					}
				}
			}
	}
	public static char yesOrNo(String yes,char search){
			do{
				
				System.out.print("Do you want "+yes);		
				search=scan.next().charAt(0);
				System.out.println();
				if(search=='y' || search=='n'){
					break;
				}else{
					System.out.println("Wrong input ");
					}
			}while(true);
			return search;
	}
	public static String studentIdCheck(String stid){
		boolean desci3=false;
		do{
			desci3=false;
			int count=0;
			System.out.print("Enter Student ID :");
			stid=scan.next();
			for (int i = 0; i <st.length; i++){
				if(stid .equals (st[i][0])){
					count++;
					}
				}
				if(count==0){
					System.out.print("Invalid Student ID.");
					char search='a';
							String yes="to search again?(y/n)";
							search=yesOrNo(yes,search);
							if(search=='y'){
								desci3=true;
								}else if(search=='n'){
									clearConsole();
									menu();
									break;										
								}
					}	
		}while(desci3);
		return stid;
	}
	public static double[] extendArray4(){
		double []temp=new double[avgRank.length+1];
		for (int i = 0; i < avgRank.length; i++){
			temp[i]=avgRank[i];	
			}
			return temp;
	}	
	public static double[] extendArray3(){
		double []temp=new double[avg1.length+1];
		for (int i = 0; i < avg1.length; i++){
			temp[i]=avg1[i];	
			}
		return temp;
	}
	public static int[][] extendArray2(){
		int [][] temp=new int[marks.length+1][2];
		for (int i = 0; i < marks.length; i++){
			for (int j = 0; j <marks[i].length; j++){
				temp[i][j]=marks[i][j];	
				}
			}
			return temp;
	}
	public static String [][] extendArray(){
		String [][] temp=new String[st.length+1][2];
		for (int i = 0; i < st.length; i++){
			for (int j = 0; j <st[i].length; j++){
				temp[i][j]=st[i][j];	
				}
		}
		return temp;
	}
	public final static void clearConsole() {
           try {
			    final String os = System.getProperty("os.name");
			    if (os.contains("Windows")) {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} else {
					System.out.print("\033[H\033[2J");
					System.out.flush();
					}
              } catch (final Exception e) {
				  e.printStackTrace();
				  }
	}			
}
