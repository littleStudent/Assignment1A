import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;



class TCPClient
{
	 public static void main(String argv[]) throws Exception
	 {
		 String modifiedSentence;
		 BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
		 Socket clientSocket = new Socket("stockholm.vitalab.tuwien.ac.at", 9000);
		 DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		 BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		 outToServer.writeBytes("!login dslab349 ahvaisoh" + "\n");
		 modifiedSentence = inFromServer.readLine();
		 System.out.println("FROM SERVER: " + modifiedSentence);
		 modifiedSentence = inFromServer.readLine();
		 System.out.println("FROM SERVER: " + modifiedSentence);
		 clientSocket.close();
	 }
}