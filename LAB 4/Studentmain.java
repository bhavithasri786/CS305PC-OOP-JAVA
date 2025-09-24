//java i.o
import java.util.Scanner;
import java.io.*;
package student;
	class Studentmain implements Operations{
	String name,id,branch,password;
	String fname = Student;
	Scanner sc = new Scanner(System.in)
		public void register(Student std){
			System.out.println("Enter Student ID");
			id = sc.nextLine();
			std.getid(id);
			System.out.println("Enter Student Branch");
			branch = sc.nextLine();
			std.getbranch();
			System.out.println("Enter Student Password");
			password = sc.nextLine()
			try{
			Bufferdwriter writer = new BufferWriter(newfilewriter(fname,true));
			writer.writer(std.getDetails());
			}catch(Ioexceptiobn ie){
				System.out.println(get message());
			}
			System.out.println("---------------------\n Registration Done Successfully \n-------------------------");
		;
			std.getpassword();
		}
		public void login(String id string passowrd){
			try{
			Bufferdreader reader = new Bufferreader(newfilereader(fname,true));}
		public void exit(){
		system.exit()
		}
		public static void main(String...args){
		Studentmain sm = new Studentmain
		System.out.println("------------------------\n WELCOME TO SMS \n------------------------");
		System.out.println("Select menu");
		s.nextline();
		switch(){
			case 1 : System.out.println("Enter Student Name");}
		}}}
