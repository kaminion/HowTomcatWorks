package ex00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSocket {

	public static void main(String[] args) throws IOException {
		java.net.ServerSocket sc = new java.net.ServerSocket(5453);
		
		Socket connectSocket = null;
		
		// 연결 시 socket을 return
		connectSocket = sc.accept();
		
		BufferedReader in = new BufferedReader
				(new InputStreamReader(connectSocket.getInputStream()));
		// 프린트의 경우 flush를 안해주면 버퍼에 쌓기만 한다..
		PrintWriter out = new PrintWriter(connectSocket.getOutputStream(), true);
		
		StringBuilder sb = new StringBuilder(8096);
		
		String data = "";
		// 연결이 계속 유지
		while(true)
		{
			data = in.readLine();
			sb.append(data);
			out.println("Connect");
			System.out.println(data);
			if(data.equalsIgnoreCase("exit")) break;
			
		}

		System.out.println(sb.toString());
		connectSocket.close();
		sc.close();
	}

}
