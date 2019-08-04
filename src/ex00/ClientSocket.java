package ex00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 서버에 연결, 포트가 잘 맞아야한다. socket() -> connect();
		Socket socket = new Socket("127.0.0.1", 5453);
		
		boolean autoflush = true;
		
		PrintWriter out = new PrintWriter(socket.getOutputStream(), autoflush);
		BufferedReader in = new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
		
		// 웹서버에 HTTP 요청을 전송, 1.1버전에선 
		out.println("GET /index.jsp HTTP/1.1");  // HTTP 메서드 요청, URI, 버전
		out.println("Host: localhost:8080"); // 요청하는 client환경
		/* General Header, 요청과 응답 이후 커넥션 유지여부
		   Close = 요청/응답이후 연결 끊기 */
		out.println("Connection: Close");// KeepAlive시 계속 연결유지해서 무한루프
		out.println(); // 공백으로 헤더의 끝을 암시
		// get방식이니 헤더만 존재한다.
		
		//응답 받기
		StringBuffer sb = new StringBuffer(8096);
		
		// 내 맘대로 포팅
		String data = "";
		while(true)
		{
			data = in.readLine();
			sb.append(data);
			System.out.println(data);
			if(data.equalsIgnoreCase("exit")) break;
		}
		System.out.println(sb.toString());
		socket.close();
		
	}

}
