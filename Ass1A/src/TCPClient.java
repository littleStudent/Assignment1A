import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;



class TCPClient
{
	 public static void main(String argv[]) throws Exception
	 {
		 Socket clientSocket = new Socket("stockholm.vitalab.tuwien.ac.at", 9000);
		 DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		 BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		 outToServer.writeBytes("!login <username> <password>" + "\n");
		 System.out.println("FROM SERVER: " + inFromServer.readLine());
		 clientSocket.close();
	 }
}