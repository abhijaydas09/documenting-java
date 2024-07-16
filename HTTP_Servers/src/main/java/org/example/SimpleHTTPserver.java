package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHTTPserver {
    /**
     * This is a simple HTTP server that listens on port 5000 and sends a response to the client.
     * The server reads the client's request, prints it to the console, and sends a response back to the client.
     * HOW to Create a Simple HTTP Server in Java :
     * 1. Create a ServerSocket object and bind it to a port.
     * 2. Wait for a client to connect using the accept() method.
     * 3. Read the client's request using the getInputStream() method of the Socket class.
     * 4. Send a response to the client using the getOutputStream() method of the Socket class.
     * 5. Close the connection.
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception{
        try {
            //Step1 : create a server socket and bind it to port 8080.
            // A server socket is a way to listen to incoming connections
            ServerSocket serverSocket = new ServerSocket(5001);
            System.out.println("Listening for connection on port 5000....");

            //Step2 : Wait for the client to connect
            // accept() method blocks until a client connects
            /**
             This line of code is accepting an incoming client connection request. The `accept()` method of the
             `ServerSocket` class blocks and waits until a client starts up and requests a connection on the host and port of this server.
             When a connection is requested, it creates a new `Socket` object and if the connection is successfully
             established, the `accept()` method returns, unblocking the server and allowing it to handle the client request.
             The `Socket` object returned by `accept()` is a different socket from the `ServerSocket` and is used for communication with the client.
             **/
            Socket clientSocket = serverSocket.accept(); //accepting an incoming client connection request.

            //Step3 : Read the client's request
            // The `InputStream` object is used to read data from the client.

            /**
             * The `getInputStream()` method of the `Socket` class returns an `InputStream` object that can be used to read data from the client.
             * The `InputStream` object is used to read data from the client. In this case, the client is sending an HTTP request, so the server.
             */

            InputStreamReader input = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader reader = new BufferedReader(input); // read the data from the client
            String line = reader.readLine(); // read the first line of the request
            while (!line.isEmpty()) {
                System.out.println(line);
                line = reader.readLine(); // read the next line of the request
            }

            //step 4 : Send a response to the client.
            // The `getOutputStream()` method of the `Socket` class returns an `OutputStream` object that can be used to send data to the client.
            OutputStream output = clientSocket.getOutputStream(); // send the data to the client
            output.write("HTTP/1.1 200 OK\r\n\r\n.".getBytes()); // send the status line
            output.write("Hello, World!".getBytes()); // send the response body
            // A status line is the first line of the response message sent by the server in the HTTP protocol. It consists of the HTTP version, a status code, and a status text (reason phrase)
            output.flush(); // flush the output stream
            output.close(); // close the output close the connection

            //Step 5 : Close the connection
            clientSocket.close();
        }catch (Exception e) {
            System.out.println("An error occurred");
        }
    }

}
