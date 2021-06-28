import static java.lang.System.out;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.net.Socket;
import java.io.PrintStream;

class Client
{
	static public void main(String...argu)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		out.println("Enter IpAddress...");
		String ipAddress=sc.next();

		Socket socket=new Socket(ipAddress,2031);
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		PrintStream ps=new PrintStream(socket.getOutputStream());
		

		while(true)
		{
			String data=br.readLine();
			if(data==null)
				break;
			ps.println(data);
		}	
	}
}