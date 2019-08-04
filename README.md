# HowTomcatWorks
How to works that tomcat?, this is Description of tomcat container
This doc for korean
because I'm korean, ;) 
Cheer up Programming.

Translate and use the this because is Korean.

톰캣 최종분석 책 코드를 자바8 코드로 제가 포팅하고, 개인공부한 소스코드들입니다.


# 0. 개발환경(Develop environment)
  - eclipse Version : 2019-06 (4.12.0)
  - JDK : JAVA 8
  - Workspace text file encording : UTF-8
  - 이 소스들의 주석은 UTF-8에 최적화 되어있습니다.
  - 이클립스 워크스페이스 설정 텍스트엔코딩을 UTF-8로 맞춰주시길 바랍니다.


# 1. prior learning (사전 학습, 권장되는 학습)
  // 거의 필수적
  - TCP/IP 동작원리 ( + 약간의 네트워크 지식 )
  - Servlet
  - HTTP
  - WAS / SERVER 의 원리 등
  
  // 알면 수월한 것
  - Java NetWork, Java IO
  
# 2. Source List 
  - ex00
    - ClientSocket.java : 말 그대로 클라이언트입니다, 포트를 바꾼다면 톰캣으로 HTTP를 보내는것도 구경할 수 있습니다. 물론 받는것도 가능
    - ServerSocket.java : 말 그대로 서버입니다. 이 포트로 접속한다면 클라이언트와 통신이 가능합니다.
