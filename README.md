# java_http_server

## Description

A simple HTTP server implementation written in Java that demonstrates basic socket programming and HTTP protocol handling.

## Features

- **Lightweight HTTP Server**: Listens for incoming HTTP connections on port 8000
- **Request Handling**: Accepts multiple client connections in a loop and processes HTTP requests
- **HTTP Response**: Returns an HTTP/1.1 200 OK response with the current system date and time
- **Request Logging**: Prints incoming HTTP request headers to the console for debugging and monitoring

## How It Works

1. Creates a `ServerSocket` bound to port 8000
2. Enters an infinite loop to accept client connections
3. For each connected client:
   - Sends an HTTP response with status 200 and current date
   - Reads and displays the HTTP request headers to the console
4. Continues accepting new connections until the program is terminated

## Usage

Compile and run the program:
```
javac HTTPServer.java
java HTTPServer
```

The server will start listening on `http://localhost:8000`. You can connect to it using:
- Web browser: Visit `http://localhost:8000`
- curl command: `curl http://localhost:8000`
- Any HTTP client

## Requirements

- Java 8 or higher

