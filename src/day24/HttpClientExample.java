package day24;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientExample {

	public static void main(String[] args) {
		HttpClient client = HttpClient.newBuilder()
				.version(Version.HTTP_1_1)
				.connectTimeout(Duration.ofSeconds(20))
				.build();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://localhost:3000/posts"))
				.header("Content-Type", "application/json")
				.GET()
				.build();
		
		try {
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println("Status Code: " + response.statusCode());
			System.out.println("Response Body: " + response.body());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
