/**
 * Copyright (C) ${2017} ${Sohan M. Nipunage} <smn57958@uga.edu>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 * 
 */

package FileSystem;

import java.io.FileWriter;
import java.io.IOException;

/**
 * createWriter() function creates a basic csv file in root directory with
 * "username" & "Tweets" as two columns
 * <p>
 * write() function appends generated usernames and tweets into "Tweets.csv"
 * file
 * <p>
 * ";" is used as an identifier for csv column separations
 * <p>
 * If CSV file opening application asks for delimiter use "'", for separator use
 * ";"
 * <p>
 * closeWriter() function closes opened functions of FileWriter
 * 
 * @author Sohan M. Nipunage
 */
public class FileWriterSystem implements FileWriterInterface {

	/**
	 * 
	 */
	FileWriter fw;

	public FileWriterSystem() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see FileSystem.FileWriterInterface#createWriter()
	 */
	@Override
	public void createWriter() {
		try {
			fw = new FileWriter("Tweets.csv");
			try {
				fw.append("tweet_url");
				fw.append('\n');
			} catch (IOException e) {
				System.out.println("Error in appending text to 'Tweets.csv' File");
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("Unable to create file 'Tweets.csv'");
			e.printStackTrace();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see FileSystem.FileWriterInterface#appendWriter()
	 */
	@Override
	public boolean write(String username, long id) {
		boolean written = false;
		try {

			fw.append("https://twitter.com/" + username + "/status/" + id);
			fw.append('\n');
			written = true;

		} catch (IOException e) {
			System.out.println("Error in writing tweets to 'Tweets.csv' File");
			e.printStackTrace();
		}
		return written;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see FileSystem.FileWriterInterface#closeWriter()
	 */
	@Override
	public void closeWriter() {
		try {
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("Unable to close writer, writer is still writing...");
			e.printStackTrace();
		}

	}

}
