package com.dxc.bankingapppoc;
import java.io.BufferedReader;
import java.io.InputStreamReader;


// This is My Customer Banking Class
class MyBankClass <T> { // T -> ICICI / HDFC / AXIS
	T obj;
	
	void create(T obj) { // T-> ICICI / HDFC / AXIS
		this.obj = obj;
	}
	
	T getInstance() { // T -> ICICI / HDFC / AXIS
		return obj;
	}
}

public class CustomerBanking {

	InputStreamReader isr = null;
	BufferedReader buff = null;
	ICICI mICICI = null;
	HDFC mHDFC = null;
	AXIS mAxis = null;

	public static void main(String[] args) throws Exception {
		
		CustomerBanking mObject = new CustomerBanking();
		
		mObject.isr = new InputStreamReader(System.in);
		mObject.buff = new BufferedReader(mObject.isr);
		int axiscustomer=0;
		int icicicustomer=0;
		int hdfccustomer=0;
		int no_ofopenacc=0;
		int no_ofdeposit=0;
		int no_ofwithdrawls=0;
		int no_ofopenFd=0;
		String mOperationChoice, continueChoice;
		boolean transaction = true;
		String continuebankchoice;
		boolean bankaccess=true;
		do{
			System.out.println("Welcome to INDIAN BANKING SYSTEM\n");
			System.out.println("SELECT  YOUR BANK\n1. ICICI\n2. HDFC\n3. AXIS\n4.None of these");
			String mBankChoice = mObject.buff.readLine();
			
			if(Integer.parseInt(mBankChoice)==1)
			{
				icicicustomer=icicicustomer+1;
				System.out.println("count of customers visited:"+icicicustomer);
			}
			else if(Integer.parseInt(mBankChoice)==2)
			{
				hdfccustomer=hdfccustomer+1;
				System.out.println("count of customers visited:"+hdfccustomer);
			}
			else if(Integer.parseInt(mBankChoice)==3)
			{
				axiscustomer=axiscustomer+1;
				System.out.println("count of customers visited:"+axiscustomer);
			}
		
			
			switch(Integer.parseInt(mBankChoice))
			{
				case 1: MyBankClass<ICICI> obj = new MyBankClass<ICICI>();
						obj.create(new ICICI());
						mObject.mICICI = obj.getInstance();
			
						do{
							System.out.println("SELECT  YOUR  Operation\n1. Open Account\n2. Deposit\n3. WithDrawl\n4. Open FD");
							mOperationChoice = mObject.buff.readLine();
							if(Integer.parseInt(mOperationChoice)==1)
							{
								no_ofopenacc=no_ofopenacc+1;
								System.out.println("no.of times account opened "+no_ofopenacc);
							}
							else if(Integer.parseInt(mOperationChoice)==2)
							{
								no_ofdeposit=no_ofdeposit+1;
								System.out.println("no.of times amount deposited "+no_ofdeposit);
							}
								
							
							else if(Integer.parseInt(mOperationChoice)==3)
							{
								no_ofwithdrawls=no_ofwithdrawls+1;
								System.out.println("no.of times amount withdraw "+no_ofwithdrawls);
							}
							else if(Integer.parseInt(mOperationChoice)==4)
							{
								no_ofopenFd=no_ofopenFd+1;
								System.out.println("no.of times open FD "+no_ofopenFd);
							}
							switch(Integer.parseInt(mOperationChoice)) 
							{
								case 1: mObject.mICICI.openAccount(mObject.buff);
									break;
								case 2: mObject.mICICI.deposit(mObject.buff);
									break;
								case 3: mObject.mICICI.withdrawl(mObject.buff);
									break;
								case 4: mObject.mICICI.openFD(mObject.buff);
									break;
								default: System.out.println("No Operation Choice Selected");
							}
					
							System.out.println("Do you Want to Continue\nYes\nNo");
							continueChoice = mObject.buff.readLine();
							if(continueChoice.equalsIgnoreCase("No"))
								transaction = false;
						  }while(transaction);
						  break;
					
				
			
				case 2: MyBankClass<HDFC> obj1 = new MyBankClass<HDFC>();
						obj1.create(new HDFC());
						mObject.mHDFC = obj1.getInstance();
						do
						{
							System.out.println("SELECT  YOUR  Operation\n1. Open Account\n2. Deposit\n3. WithDrawl\n4. Open FD");
							mOperationChoice = mObject.buff.readLine();
							if(Integer.parseInt(mOperationChoice)==1)
							{
								no_ofopenacc=no_ofopenacc+1;
								System.out.println("no.of times account opened "+no_ofopenacc);
							}
							else if(Integer.parseInt(mOperationChoice)==2)
							{
								no_ofdeposit=no_ofdeposit+1;
								System.out.println("no.of times amount deposited "+no_ofdeposit);
							}
								
							
							else if(Integer.parseInt(mOperationChoice)==3)
							{
								no_ofwithdrawls=no_ofwithdrawls+1;
								System.out.println("no.of times amount withdraw "+no_ofwithdrawls);
							}
							else if(Integer.parseInt(mOperationChoice)==4)
							{
								no_ofopenFd=no_ofopenFd+1;
								System.out.println("no.of times open FD "+no_ofopenFd);
							}
							switch(Integer.parseInt(mOperationChoice)) 
							{
								case 1: mObject.mHDFC.openAccount(mObject.buff);
										break;
								case 2: mObject.mHDFC.deposit(mObject.buff);
										break;
								case 3: mObject.mHDFC.withdrawl(mObject.buff);
										break;
								case 4:  mObject.mHDFC.openFD(mObject.buff);
										break;
								default: System.out.println("No Operation Choice Selected");
							}
							System.out.println("Do you Want to Continue\nYes\nNo");
							continueChoice = mObject.buff.readLine();
							if(continueChoice.equalsIgnoreCase("No"))
								transaction = false;
						}while(transaction);
						break;
			
				case 3: MyBankClass<AXIS> obj2 = new MyBankClass<AXIS>();
						obj2.create(new AXIS());
						mObject.mAxis = obj2.getInstance();
						do
						{
							System.out.println("SELECT  YOUR  Operation\n1. Open Account\n2. Deposit\n3. WithDrawl\n4. Open FD");
							mOperationChoice = mObject.buff.readLine();
							if(Integer.parseInt(mOperationChoice)==1)
							{
								no_ofopenacc=no_ofopenacc+1;
								System.out.println("no.of times account opened "+no_ofopenacc);
							}
							else if(Integer.parseInt(mOperationChoice)==2)
							{
								no_ofdeposit=no_ofdeposit+1;
								System.out.println("no.of times amount deposited "+no_ofdeposit);
							}
								
							
							else if(Integer.parseInt(mOperationChoice)==3)
							{
								no_ofwithdrawls=no_ofwithdrawls+1;
								System.out.println("no.of times amount withdraw "+no_ofwithdrawls);
							}
							else if(Integer.parseInt(mOperationChoice)==4)
							{
								no_ofopenFd=no_ofopenFd+1;
								System.out.println("no.of times open FD "+no_ofopenFd);
							}
							switch(Integer.parseInt(mOperationChoice))
							{
								case 1: mObject.mAxis.openAccount(mObject.buff);
										break;
								case 2: mObject.mAxis.deposit(mObject.buff);
										break;
								case 3: mObject.mAxis.withdrawl(mObject.buff);
										break;
								case 4:  mObject.mAxis.openFD(mObject.buff);
										break;
								default: System.out.println("No Operation Choice Selected");
							}
							System.out.println("Do you Want to Continue\nYes\nNo");
							continueChoice = mObject.buff.readLine();
							if(continueChoice.equalsIgnoreCase("No"))
								transaction = false;
						}while(transaction);
						break;
		
				default: System.out.println("No Choice of Bank Done");
			}
						 System.out.println("do you want ot continue\nYes\nNo");
						 continuebankchoice=mObject.buff.readLine();
						 if(continuebankchoice.equalsIgnoreCase("No"))
							bankaccess=false;
			
		 }while(bankaccess);
	}
}
