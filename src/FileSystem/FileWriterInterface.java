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

/**
 * * createWriter() function creates a basic csv file in root directory with
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
public interface FileWriterInterface {

	public void createWriter();

	public boolean write(String username, long id);

	public void closeWriter();

}
