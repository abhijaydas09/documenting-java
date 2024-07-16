package httpserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHTTPserver {
    public static void main(String[] args) throws Exception{
        //Step1 : create a server socket and bind it to port 8080.
        // A server socket is a way to listen to incoming connections
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");

        //Step2 : Wait for the client to connect
        // accept() method blocks until a client connects
        /**
        This line of code is accepting an incoming client connection request. The `accept()` method of the
        `ServerSocket` class blocks and waits until a client starts up and requests a connection on the host and port of this server.
        When a connection is requested, it creates a new `Socket` object and if the connection is successfully
        established, the `accept()` method returns, unblocking the server and allowing it to handle the client request.
         The `Socket` object returned by `accept()` is a different socket from the `ServerSocket` and is used for communication with the client.
         **/
        Socket clientSocket = serverSocket.accept() ; //accepting an incoming client connection request.

        //Step3 : Read the client's request
        // The `InputStream` object is used to read data from the client.

        /**
         * The `getInputStream()` method of the `Socket` class returns an `InputStream` object that can be used to read data from the client.
         * The `InputStream` object is used to read data from the client. In this case, the client is sending an HTTP request, so the server.
         */

        InputStreamReader input  = new InputStreamReader(clientSocket.getInputStream());
        BufferedReader reader = new BufferedReader(input) ; // read the data from the client
        String line  = reader.readLine() ; // read the first line of the request
        while(!line.isEmpty()) {
            System.out.println(line);
            line = reader.readLine(); // read the next line of the request

        }
    }
}

