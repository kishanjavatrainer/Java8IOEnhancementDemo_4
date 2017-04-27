package com.infotech.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args)   {
		realAllLines();
		newBufferedReader();
	}

	private static void newBufferedReader() {
		Path path = Paths.get("data.txt");
		try {
			//BufferedReader bufferedReader = Files.newBufferedReader(path);
			BufferedReader bufferedReader = Files.newBufferedReader(path,Charset.forName("UTF-8"));
			Stream<String> lines = bufferedReader.lines();
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void realAllLines() {
		Path path = Paths.get("data.txt");
		try {
			//List<String> readAllLines = Files.readAllLines(path);
			List<String> readAllLines = Files.readAllLines(path,Charset.forName("UTF-8"));
			for (String line : readAllLines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
